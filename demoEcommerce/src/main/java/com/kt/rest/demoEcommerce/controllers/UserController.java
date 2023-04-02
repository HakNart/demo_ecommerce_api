package com.kt.rest.demoEcommerce.controllers;

import com.kt.rest.demoEcommerce.controllers.exeptions.UserNotFoundException;
import com.kt.rest.demoEcommerce.models.authEntities.User;
import com.kt.rest.demoEcommerce.models.authEntities.UserDetailResponse;
import com.kt.rest.demoEcommerce.models.shopEntities.Order;
import com.kt.rest.demoEcommerce.models.shopEntities.OrderDetailResponse;
import com.kt.rest.demoEcommerce.repository.OrderRepository;
import com.kt.rest.demoEcommerce.repository.UserRepository;
import com.kt.rest.demoEcommerce.services.BusinessService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    private final BusinessService businessService;


    public UserController(UserRepository userRepository, OrderRepository orderRepository, BusinessService businessService) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;

        this.businessService = businessService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetailResponse> getUser(@PathVariable Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        UserDetailResponse userDetailResponse = UserDetailResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .id(user.getId())
                .build();
        return ResponseEntity.ok(userDetailResponse);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderDetailResponse>> getUserOrders(@RequestParam(value = "user.id", required =true) Long id) {
        List<Order> orderList = orderRepository.findAllByUserId(id);
        List<OrderDetailResponse> orderDetailResponseList = new ArrayList<>();
        orderList.forEach(order -> {
            orderDetailResponseList.add(businessService.createOrderDetailResponse(order));
        });
        return ResponseEntity.ok(orderDetailResponseList);
    }
}

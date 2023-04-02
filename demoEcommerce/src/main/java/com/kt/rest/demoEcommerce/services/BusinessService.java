package com.kt.rest.demoEcommerce.services;

import com.kt.rest.demoEcommerce.controllers.exeptions.UserNotFoundException;
import com.kt.rest.demoEcommerce.models.authEntities.User;
import com.kt.rest.demoEcommerce.models.webdata.OrderDetailResponse;
import com.kt.rest.demoEcommerce.models.webdata.UserDetailResponse;
import com.kt.rest.demoEcommerce.models.shopEntities.Order;
import com.kt.rest.demoEcommerce.models.webdata.OrderHistoryDetailResponse;
import com.kt.rest.demoEcommerce.repository.OrderRepository;
import com.kt.rest.demoEcommerce.repository.ProductRepository;
import com.kt.rest.demoEcommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private UserRepository userRepository;


    public BusinessService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }
    public UserDetailResponse createUserDetailResponse(User user) {

        return UserDetailResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .id(user.getId())
                .build();
    }
    public OrderHistoryDetailResponse createOrderHistoryDetailResponse(Order order) {

        return OrderHistoryDetailResponse.builder()
                .id(order.getId())
                .userId(order.getUser().getId())
                .amountPaid(order.getAmountPaid())
                .quantity(order.getQuantity())
                .orderItems(order.getOrderItems())
                .build();

    }
    public OrderDetailResponse createOrderDetailResponse(Order order, UserDetailResponse userDetailResponse) {
        User user = userRepository.findById(order.getUser().getId())
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        return OrderDetailResponse.builder()
                .id(order.getId())
                .amountPaid(order.getAmountPaid())
                .quantity(order.getQuantity())
                .userDetail(userDetailResponse)
                .build();
    }
}

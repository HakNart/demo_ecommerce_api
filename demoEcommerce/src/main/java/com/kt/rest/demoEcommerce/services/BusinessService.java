package com.kt.rest.demoEcommerce.services;

import com.kt.rest.demoEcommerce.models.shopEntities.Order;
import com.kt.rest.demoEcommerce.models.shopEntities.OrderDetailResponse;
import com.kt.rest.demoEcommerce.repository.OrderRepository;
import com.kt.rest.demoEcommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;



    public BusinessService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public OrderDetailResponse createOrderDetailResponse(Order order) {

        return OrderDetailResponse.builder()
                .id(order.getId())
                .userId(order.getUser().getId())
                .amountPaid(order.getAmountPaid())
                .quantity(order.getQuantity())
                .orderItems(order.getOrderItems())
                .build();

    }
}

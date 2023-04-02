package com.kt.rest.demoEcommerce.repository;

import com.kt.rest.demoEcommerce.models.shopEntities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

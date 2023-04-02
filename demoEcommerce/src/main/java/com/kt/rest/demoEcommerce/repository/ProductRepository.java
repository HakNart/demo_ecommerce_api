package com.kt.rest.demoEcommerce.repository;

import com.kt.rest.demoEcommerce.models.shopEntities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameLike(String name);
}

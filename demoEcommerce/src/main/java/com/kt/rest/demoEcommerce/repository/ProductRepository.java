package com.kt.rest.demoEcommerce.repository;

import com.kt.rest.demoEcommerce.models.shopEntities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

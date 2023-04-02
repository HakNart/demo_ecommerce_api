package com.kt.rest.demoEcommerce.controllers;


import com.kt.rest.demoEcommerce.models.shopEntities.Product;
import com.kt.rest.demoEcommerce.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(name = "name_like", required = false, defaultValue = "") String name,
                                        @RequestParam(name = "featured", required = false, defaultValue = "") String featured) {
        if (!name.isEmpty()) {
            return productRepository.findAllByNameContainingIgnoreCase(name);
        } else if (featured.equals("true")) {
            return productRepository.findAllByFeaturedTrue();
        } else {
            return productRepository.findAll();
        }
    }


}

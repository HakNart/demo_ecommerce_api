//package com.kt.rest.demoEcommerce.models.shopEntities;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "order_item")
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//
//    // Constructors, getters, and setters
//
//    public OrderItem(Long id, Order order, Product product) {
//        this.id = id;
//        this.order = order;
//        this.product = product;
//    }
//
//    public OrderItem() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//
//}
package com.kt.rest.demoEcommerce.models.shopEntities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailResponse {
    private Long id;

    @JsonProperty("cartList")
    private Set<Product> orderItems;
    private Integer userId;

    @JsonProperty("amount_paid")
    private BigDecimal amountPaid;
    private Integer quantity;
}

package com.kt.rest.demoEcommerce.models.webdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailResponse {
    @JsonProperty("amount_paid")
    private BigDecimal amountPaid;
    private Integer quantity;
    private Long id;

    @JsonProperty("user")
    private UserDetailResponse userDetail;
}

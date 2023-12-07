package com.example.orderservice.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private String orderId;
    private String orderName;
    private int quantity;
    private BigDecimal price;

}

package com.example.stockservice.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {

    private String status; // pending, progress, completed
    private String message;
    private Order order;
}

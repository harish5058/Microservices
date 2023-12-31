package com.microService.OrderService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "ORDER_DETAILS")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "PRODUCT_ID")
    private long productId;
    @Column(name = "QUANTITY")
    private long quantity;
    @Column(name = "ORDER_DATE")
    private Instant orderDate;
    @Column(name = "ORDER_DATE")
    private String orderStatus;
    @Column(name = "TOTAL_AMOUNT")
    private long amount;

}

package com.nitin.pizza.backend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="order")
public class Order {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="status")
    private String status;

    @Column(name="user_id")
    private String userId;

    @Column(name="total_price")
    private Double totalPrice;

    @Column(name="delivery_charges")
    private Double deliveryCharges;
}

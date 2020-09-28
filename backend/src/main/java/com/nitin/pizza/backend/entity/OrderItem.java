package com.nitin.pizza.backend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="order_item")
public class OrderItem implements Serializable {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="price")
    private Double price;

    @Column(name="size")
    private String size;

    @Column(name="quantity")
    private Integer quantity;

    @Column(name="product_id")
    private String productId;

    @Column(name="product_type")
    private String productType;

    @Column(name="fk_order_id")
    private String fkOrderId;

}

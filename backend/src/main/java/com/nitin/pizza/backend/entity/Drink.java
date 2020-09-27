package com.nitin.pizza.backend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="drink")
public class Drink {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="base_price")
    private Double basePrice;

    @Column(name="img_url")
    private String imgUrl;
}

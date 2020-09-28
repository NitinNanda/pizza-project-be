package com.nitin.pizza.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="pizza")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pizza implements Serializable {

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

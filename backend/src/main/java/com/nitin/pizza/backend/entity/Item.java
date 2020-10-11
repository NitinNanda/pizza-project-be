package com.nitin.pizza.backend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="item")
public class Item implements Serializable {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="img_url")
    private String imgUrl;

    @Column(name="detail")
    private String detail;

    @Column(name="path")
    private String path;
}

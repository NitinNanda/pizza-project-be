package com.nitin.pizza.backend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="tax")
public class Tax implements Serializable {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="category")
    private String category;

    @Column(name="gst")
    private Double gst;

    @Column(name="pst")
    private Double pst;
}

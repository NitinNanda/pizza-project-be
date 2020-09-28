package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Drink;
import com.nitin.pizza.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}

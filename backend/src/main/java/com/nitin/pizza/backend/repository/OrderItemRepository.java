package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Drink;
import com.nitin.pizza.backend.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
}

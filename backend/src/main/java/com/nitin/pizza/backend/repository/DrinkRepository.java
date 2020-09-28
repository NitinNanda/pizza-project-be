package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Drink;
import com.nitin.pizza.backend.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, String> {
}

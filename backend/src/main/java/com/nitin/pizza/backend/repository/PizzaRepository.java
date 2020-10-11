package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, String> {

    @Query(value = "Select * from Pizza;", nativeQuery = true)
    List<Pizza> getAll();
}

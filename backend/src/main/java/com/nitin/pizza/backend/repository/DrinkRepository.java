package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, String> {

    @Query(value = "Select * from Drink;", nativeQuery = true)
    List<Drink> getAll();
}

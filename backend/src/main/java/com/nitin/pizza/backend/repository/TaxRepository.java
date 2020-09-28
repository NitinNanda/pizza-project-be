package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Drink;
import com.nitin.pizza.backend.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, String> {
}

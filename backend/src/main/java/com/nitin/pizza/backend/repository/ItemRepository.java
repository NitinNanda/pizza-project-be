package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

    @Query(value = "Select * from Item;", nativeQuery = true)
    List<Item> getAll();
}

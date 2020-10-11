package com.nitin.pizza.backend.repository;

import com.nitin.pizza.backend.entity.Side;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SideRepository extends JpaRepository<Side, String> {

    @Query(value = "Select * from Side;", nativeQuery = true)
    List<Side> getAll();
}

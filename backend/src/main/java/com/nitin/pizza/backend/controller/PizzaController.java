package com.nitin.pizza.backend.controller;

import com.nitin.pizza.backend.entity.Pizza;
import com.nitin.pizza.backend.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping("/pizza/{id}")
    public Pizza getPizzaById(@PathVariable String id){
        return pizzaRepository.getOne(id);
    }
}

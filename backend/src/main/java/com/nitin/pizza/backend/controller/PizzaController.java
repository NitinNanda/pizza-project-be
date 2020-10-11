package com.nitin.pizza.backend.controller;

import com.nitin.pizza.backend.entity.Pizza;
import com.nitin.pizza.backend.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping("/pizza/{id}")
    public Pizza getPizzaById(@PathVariable String id){
        return pizzaRepository.getOne(id);
    }

    @GetMapping("/pizza/all")
    public List<Pizza> getAllPizza(){
        return pizzaRepository.getAll();
    }

//    @DeleteMapping("/pizza/delete/{id}")
//    public Pizza deletePizzaById(@PathVariable String)
}

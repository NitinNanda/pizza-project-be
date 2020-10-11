package com.nitin.pizza.backend.controller;

import com.nitin.pizza.backend.entity.Drink;
import com.nitin.pizza.backend.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping("/drink/{id}")
    public Drink getDrinkById(@PathVariable String id){
        return drinkRepository.getOne(id);
    }

    @GetMapping("/drink/all")
    public List<Drink> getAllDrink(){
        return drinkRepository.getAll();
    }

//    @DeleteMapping("/pizza/delete/{id}")
//    public Pizza deletePizzaById(@PathVariable String)
}

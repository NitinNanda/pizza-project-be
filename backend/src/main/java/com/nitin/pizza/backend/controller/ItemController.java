package com.nitin.pizza.backend.controller;

import com.nitin.pizza.backend.entity.Item;
import com.nitin.pizza.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/item/{id}")
    public Item getDrinkById(@PathVariable String id){
        return itemRepository.getOne(id);
    }

    @GetMapping("/item/all")
    public List<Item> getAllDrink(){
        return itemRepository.getAll();
    }

//    @DeleteMapping("/pizza/delete/{id}")
//    public Pizza deletePizzaById(@PathVariable String)
}

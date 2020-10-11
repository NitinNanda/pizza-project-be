package com.nitin.pizza.backend.controller;

import com.nitin.pizza.backend.entity.Side;
import com.nitin.pizza.backend.repository.SideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SideController {

    @Autowired
    private SideRepository sideRepository;

    @GetMapping("/side/{id}")
    public Side getSideById(@PathVariable String id){
        return sideRepository.getOne(id);
    }

    @GetMapping("/side/all")
    public List<Side> getAllSide(){
        return sideRepository.getAll();
    }

//    @DeleteMapping("/pizza/delete/{id}")
//    public Pizza deletePizzaById(@PathVariable String)
}

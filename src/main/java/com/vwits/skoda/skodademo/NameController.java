package com.vwits.skoda.skodademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;


@RestController

public class NameController
{
    @Autowired
    ModelService modelservice;

    @GetMapping("/name")
    private List<Model> getAllEmployees() {
        return modelservice.getAllEmployees();
    }

    @GetMapping("/name/{id}")
    private Model getdetails(@PathVariable("id") int id) {
        return modelservice.searchById(id);
    }

    @DeleteMapping("/name/{id}")
    private void deletedetails(@PathVariable("id") int id) {
        modelservice.delete(id);
    }

    @PostMapping("/name")
    private long savedetails(@RequestBody Model model) {
        modelservice.saveOrUpdate(model);
        return model.getId();
    }





}

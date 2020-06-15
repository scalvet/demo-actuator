package com.example.demo.actuator.controller;

import com.example.demo.actuator.service.CustomerService;
import com.example.demo.actuator.domain.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("/customers")
public class CustomerController {
    private CustomerService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Customer customer) {
        service.save(customer);
    }
}
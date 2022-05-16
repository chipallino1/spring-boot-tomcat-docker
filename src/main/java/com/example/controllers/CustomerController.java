package com.example.controllers;

import com.example.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class CustomerController {

    @GetMapping("/getCustomer")
    public Customer getCustomer() {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("Kotik");
        customer.setLastName("Zhena");
        return customer;
    }
}

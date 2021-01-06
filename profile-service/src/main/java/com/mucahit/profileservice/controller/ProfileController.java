package com.mucahit.profileservice.controller;

import com.mucahit.profileservice.service.CustomerService;
import com.mucahit.rentcloud.commons.model.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ProfileController {

    private CustomerService customerService;

    @PostMapping("")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}

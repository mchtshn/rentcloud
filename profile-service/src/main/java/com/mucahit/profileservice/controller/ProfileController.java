package com.mucahit.profileservice.controller;

import com.mucahit.profileservice.service.CustomerService;
import com.mucahit.rentcloud.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/profile")
    public Customer fetch(@RequestParam int profileId) {
        return customerService.fetchById(profileId);
    }

    @GetMapping(value = "/profiles")
    public List<Customer> fetch() {
        return customerService.fetchAllProfiles();
    }

    @PostMapping(value = "/profile")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}

package com.mucahit.profileservice.service;

import com.mucahit.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer fetchById(int id);

    List<Customer> fetchAllProfiles();
}

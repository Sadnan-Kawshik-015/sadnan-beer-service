package com.example.beerservice.web.service;

import com.example.beerservice.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO savedNewCustomer(CustomerDTO customerDTO);
}

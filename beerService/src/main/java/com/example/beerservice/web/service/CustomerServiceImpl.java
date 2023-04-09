package com.example.beerservice.web.service;

import com.example.beerservice.web.model.BeerDTO;
import com.example.beerservice.web.model.BeerStyle;
import com.example.beerservice.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Kawshik")
                .build();
    }

    @Override
    public CustomerDTO savedNewCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }
}

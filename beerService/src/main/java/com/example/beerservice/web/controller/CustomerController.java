package com.example.beerservice.web.controller;

import com.example.beerservice.web.model.BeerDTO;
import com.example.beerservice.web.model.CustomerDTO;
import com.example.beerservice.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{customer_id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable(name = "customer_id") UUID customerId)
    {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK );
//        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);

    }
    @PostMapping("/")
    public ResponseEntity saveNewCustomer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO savedDTO = customerService.savedNewCustomer(customerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/customer/"+savedDTO.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }
}

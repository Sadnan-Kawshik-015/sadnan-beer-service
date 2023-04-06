package com.example.beerclient.web.client;

import com.example.beerclient.web.model.BeerDTO;
import com.example.beerclient.web.model.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerClientTest {

    @Autowired
    CustomerClient client;

    @Test
    void getCustomerById() {
        CustomerDTO dto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void testSaveNewCustomer()
    {
        CustomerDTO customerDTO = CustomerDTO.builder().id(UUID.randomUUID()).build();
        URI uri = client.saveNewCustomer(customerDTO);
        assertNotNull(customerDTO);
        System.out.println(uri.toString());

    }

    @Test
    void testUpdateCustomer()
    {
        CustomerDTO customerDTO = CustomerDTO.builder().id(UUID.randomUUID()).build();
        client.updateCustomer(UUID.randomUUID(),customerDTO);


    }

    @Test
    void testDeleteCustomer()
    {
//        BeerDTO beerDTO = BeerDTO.builder().beerName(" New Beer").build();
        client.deleteCustomer(UUID.randomUUID());


    }

}
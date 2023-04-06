package com.example.beerclient.web.client;

import com.example.beerclient.web.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweyClientTest {
    @Autowired
    BreweyClient client;

    @Test
    void getBeerById() {
        BeerDTO dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void testSaveNewBeer()
    {
        BeerDTO beerDTO = BeerDTO.builder().beerName(" New Beer").build();
        URI uri = client.saveNewBeer(beerDTO);
        assertNotNull(beerDTO);
        System.out.println(uri.toString());

    }

    @Test
    void testUpdateBeer()
    {
        BeerDTO beerDTO = BeerDTO.builder().beerName(" New Beer").build();
        client.updateBeer(UUID.randomUUID(),beerDTO);


    }

    @Test
    void testDeleteBeer()
    {
//        BeerDTO beerDTO = BeerDTO.builder().beerName(" New Beer").build();
        client.deleteBeer(UUID.randomUUID());


    }
}
package com.example.beerservice.web.controller;

import com.example.beerservice.bootstrap.BeerLoader;
import com.example.beerservice.web.model.BeerDTO;
import com.example.beerservice.web.model.BeerStyle;
import com.example.beerservice.web.service.BeerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.BDDMockito.given;

@WebMvcTest(BeerController.class)

class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    BeerService beerService;


//    @Test
//    void getBeerById() throws Exception {
//
//        given(beerService.getById(any(), anyBoolean())).willReturn(getValidBeerDto());
//
//        mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//
//    }

    @Test
    void saveNewBeer() {
    }

    @Test
    void handleUpdate() {
    }

//    BeerDTO getValidBeerDto(){
//        return BeerDTO.builder()
//                .beerName("My Beer")
//                .beerStyle(BeerStyle.ALE)
//                .price(new BigDecimal("2.99"))
//                .upc(BeerLoader)
//                .build();
//    }
}
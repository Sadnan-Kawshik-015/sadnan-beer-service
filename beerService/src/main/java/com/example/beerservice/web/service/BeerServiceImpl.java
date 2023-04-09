package com.example.beerservice.web.service;

import com.example.beerservice.web.model.BeerDTO;
import com.example.beerservice.web.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.ALE)
                .build();
    }

    @Override
    public BeerDTO savedNewBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        log.debug("Update a beer...");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Delete a beer...");

    }
}

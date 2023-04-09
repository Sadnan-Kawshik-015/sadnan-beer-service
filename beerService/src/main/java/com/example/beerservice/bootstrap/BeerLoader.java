package com.example.beerservice.bootstrap;

import com.example.beerservice.domain.Beer;
import com.example.beerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();

    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0)
        {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("JPA")
                    .quantityToBrew(200)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.25"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("JPA")
                    .quantityToBrew(200)
                    .upc(337010000002L)
                    .price(new BigDecimal("11.25"))
                    .build());
        }
        System.out.println("loaded Beers : "+beerRepository.count());
    }
}

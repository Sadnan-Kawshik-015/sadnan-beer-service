package com.example.beerservice.web.service;

import com.example.beerservice.domain.Beer;
import com.example.beerservice.repositories.BeerRepository;
import com.example.beerservice.web.controller.NotFoundException;
import com.example.beerservice.web.mappers.BeerMapper;
import com.example.beerservice.web.model.BeerDTO;
import com.example.beerservice.web.model.BeerStyle;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return beerMapper.beerToBeerDTO(beerRepository.findById(beerId).orElseThrow(NotFoundException::new));
    }

    @Override
    public BeerDTO savedNewBeer(BeerDTO beerDTO) {
        return beerMapper.beerToBeerDTO(beerRepository.save(beerMapper.beerDtoTobeer(beerDTO)));
    }

    @Override
    public BeerDTO updateBeer(UUID beerId, BeerDTO beerDTO) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDTO.getBeerName());
        beer.setBeerStyle(beerDTO.getBeerStyle().name());
        beer.setPrice(beerDTO.getPrice());
        beer.setUpc(beerDTO.getUpc());
        log.debug("Update a beer...");
        return beerMapper.beerToBeerDTO(beerRepository.save(beer));

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Delete a beer...");

    }
}

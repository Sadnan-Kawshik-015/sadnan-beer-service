package com.example.beerservice.web.mappers;

import com.example.beerservice.domain.Beer;
import com.example.beerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDTO beerToBeerDTO(Beer beer);
    Beer beerDtoTobeer(BeerDTO beerDTO);
}

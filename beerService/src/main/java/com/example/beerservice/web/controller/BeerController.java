package com.example.beerservice.web.controller;


import com.example.beerservice.web.model.BeerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("/{beer_id}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable(name = "beer_id") UUID beerId)
    {
//        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK );
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDTO beerDTO) {
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("/{beer_id}")
    public ResponseEntity handleUpdate(@PathVariable(name = "beer_id")  UUID beerId,@RequestBody BeerDTO beerDTO)
    {
//        beerService.updateBeer(beerId,beerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }


}

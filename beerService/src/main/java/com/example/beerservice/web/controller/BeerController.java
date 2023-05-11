package com.example.beerservice.web.controller;


import com.example.beerservice.web.model.BeerDTO;
import com.example.beerservice.web.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/beer")
public class BeerController {

    private final BeerService beerService;


    @GetMapping("/{beer_id}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable(name = "beer_id") UUID beerId)
    {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK );
//        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);

    }
    @PostMapping("/")
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDTO beerDTO) {
        BeerDTO savedDTO = beerService.savedNewBeer(beerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/beer/"+savedDTO.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }
    @PutMapping("/{beer_id}")
    public ResponseEntity updateBeer(@PathVariable(name = "beer_id")  UUID beerId,@RequestBody BeerDTO beerDTO)
    {
       BeerDTO beerDTO1 = beerService.updateBeer(beerId,beerDTO);
        return new ResponseEntity(beerDTO1,HttpStatus.NO_CONTENT);

    }
//
//    @PutMapping("/{beer_id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)//returns empty body
//    public void deleteBeer(@PathVariable(name = "beer_id")  UUID beerId)
//    {
//        beerService.deleteById(beerId);
//    }


}

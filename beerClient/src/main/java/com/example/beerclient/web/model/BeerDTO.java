package com.example.beerclient.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDTO {
    private  UUID id;
    private String beerName;
    private String beerStyle;
    private long upc;
    
}

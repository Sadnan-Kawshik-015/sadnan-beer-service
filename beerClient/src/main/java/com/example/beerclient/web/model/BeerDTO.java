package com.example.beerclient.web.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
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
    @Null//no one can't set this
    private  UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;
    @Positive
    private long upc;
    
}

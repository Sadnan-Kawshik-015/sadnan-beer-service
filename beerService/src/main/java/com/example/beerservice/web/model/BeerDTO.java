package com.example.beerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
    private UUID id;
    private int version;
    private BigDecimal price;
    private Integer quantityOnHand;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;

}

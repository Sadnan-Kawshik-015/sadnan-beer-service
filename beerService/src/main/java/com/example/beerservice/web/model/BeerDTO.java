package com.example.beerservice.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
    @Null//so that it can not be manipulated by outside world
    private UUID id;

    @Null
    private int version;
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;

    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyle beerStyle;

    @Positive
    @NotNull
    private Long upc;

}

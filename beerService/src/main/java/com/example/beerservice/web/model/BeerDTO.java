package com.example.beerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;

    @Null
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;
    @Null
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyle beerStyle;

    @Positive
    @NotNull
    private Long upc;

}

package com.example.beerservice.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private UUID id;

    @NotBlank
    @Size(min = 3,max = 100)
    private String name;
}

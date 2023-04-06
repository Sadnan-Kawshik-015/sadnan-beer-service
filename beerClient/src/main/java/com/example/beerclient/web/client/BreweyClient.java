package com.example.beerclient.web.client;

import com.example.beerclient.web.model.BeerDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;


@Component
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
public class BreweyClient {

    public final String BEER_PATH_V1 = "/api/v1/beer/";
    private String apiHost;

    private final RestTemplate restTemplate;


    //Spring will inject  a rest template builder and a constructor injection will occure
    public BreweyClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    //grab me a BeerDTo object from mentioned url
    public BeerDTO getBeerById(UUID uuid)
    {
        return restTemplate.getForObject(apiHost + BEER_PATH_V1 + uuid.toString(), BeerDTO.class);
    }
    public URI saveNewBeer(BeerDTO beerDTO)
    {
        return restTemplate.postForLocation(apiHost + BEER_PATH_V1, beerDTO);
    }

    public void updateBeer(UUID uuid,BeerDTO beerDTO)
    {
        restTemplate.put(apiHost+BEER_PATH_V1+"/"+uuid.toString(),beerDTO);
    }

    public void deleteBeer(UUID uuid)
    {
        restTemplate.delete(apiHost+BEER_PATH_V1+"/"+uuid);
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}

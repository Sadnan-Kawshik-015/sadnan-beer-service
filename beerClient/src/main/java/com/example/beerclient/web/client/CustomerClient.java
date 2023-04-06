package com.example.beerclient.web.client;

import com.example.beerclient.web.model.BeerDTO;
import com.example.beerclient.web.model.CustomerDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
@ConfigurationProperties(prefix = "sfg.customer", ignoreUnknownFields = false)
public class CustomerClient {
    public final String CUSTOMER_PATH_V1 = "/api/v1/customer/";
    private String apiHost;

    private final RestTemplate restTemplate;

    public CustomerClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    //grab me a BeerDTo object from mentioned url
    public CustomerDTO getCustomerById(UUID uuid)
    {
        return restTemplate.getForObject(apiHost + CUSTOMER_PATH_V1 + uuid.toString(), CustomerDTO.class);
    }
    public URI saveNewCustomer(CustomerDTO customerDTO)
    {
        return restTemplate.postForLocation(apiHost + CUSTOMER_PATH_V1, customerDTO);
    }

    public void updateCustomer(UUID uuid,CustomerDTO customerDTO)
    {
        restTemplate.put(apiHost+CUSTOMER_PATH_V1+"/"+uuid.toString(),customerDTO);
    }

    public void deleteCustomer(UUID uuid)
    {
        restTemplate.delete(apiHost+CUSTOMER_PATH_V1+"/"+uuid);
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}

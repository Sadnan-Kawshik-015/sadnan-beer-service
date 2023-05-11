package com.example.beerservice.web.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPageList extends PageImpl<BeerDTO> {

    /**
     * Constructs a BeerPageList object from the given JSON properties.
     *
     * @param content          The list of BeerDTO objects.
     * @param number           The current page number.
     * @param size             The size (number of elements) of each page.
     * @param totalElements    The total number of elements in the dataset.
     * @param pageable         Additional information about the pagination settings.
     * @param last             Indicates whether the current page is the last page.
     * @param totalPages       The total number of pages.
     * @param sort             The sorting information.
     * @param first            Indicates whether the current page is the first page.
     * @param numberOfElements The number of elements on the current page.
     */
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)//means the constructor should be invoked using properties from the JSON object
    public BeerPageList(@JsonProperty("content") List<BeerDTO> content,
                         @JsonProperty("number") int number,
                         @JsonProperty("size") int size,
                         @JsonProperty("totalElements") Long totalElements,
                         @JsonProperty("pageable") JsonNode pageable,
                         @JsonProperty("last") boolean last,
                         @JsonProperty("totalPages") int totalPages,
                         @JsonProperty("sort") JsonNode sort,
                         @JsonProperty("first") boolean first,
                         @JsonProperty("numberOfElements") int numberOfElements) {

        super(content, PageRequest.of(number, size), totalElements);
    }
    public BeerPageList(List<BeerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPageList(List<BeerDTO> content) {
        super(content);
    }
}

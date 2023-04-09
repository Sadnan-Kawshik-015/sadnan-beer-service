package com.example.beerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CustomerPageList extends PageImpl<CustomerDTO> {
    public CustomerPageList(List<CustomerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public CustomerPageList(List<CustomerDTO> content) {
        super(content);
    }
}

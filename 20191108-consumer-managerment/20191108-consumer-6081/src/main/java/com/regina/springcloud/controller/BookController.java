package com.regina.springcloud.controller;

import com.regina.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/selectAll")
    public List<Book> selectAll(){
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}

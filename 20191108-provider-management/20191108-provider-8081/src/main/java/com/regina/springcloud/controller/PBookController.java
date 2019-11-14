package com.regina.springcloud.controller;

import com.regina.springcloud.model.Book;
import com.regina.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PBookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        System.out.println("8081");
        return bookService.selectAll();
    }
}

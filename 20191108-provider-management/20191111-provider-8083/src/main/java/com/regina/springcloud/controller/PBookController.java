package com.regina.springcloud.controller;

import com.regina.springcloud.model.Book;
import com.regina.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author Regina
 * @data 2019/11/13 15:51
 * @project 20191108-springcloud
 * @declaration:
 */
@RestController
public class PBookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectALLBooks(){
        System.out.println("8083");
        return bookService.selectAll();
    }
}

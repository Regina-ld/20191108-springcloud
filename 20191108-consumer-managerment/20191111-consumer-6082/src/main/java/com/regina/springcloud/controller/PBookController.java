package com.regina.springcloud.controller;

import com.regina.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:Administrator regina
 * @ClassName BookController
 * @Description:
 * @Date 2019/11/11
 * @Verion V1.0
 * @Description
 *  必须要和eureka中Application的值一模一样！
 *  在使用ribbon集成eureka做负载均衡的时候，不再使用原始的地址进行访问，直接使用eureka中的Application的值进行访问
 *  如果需要做负载均衡就必须要把所有的provider的application.name的值保持一致！！！
 **/
@RestController
public class PBookController {

    private static final String URL="http://BOOK-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject(URL+"all",List.class);
    }
}



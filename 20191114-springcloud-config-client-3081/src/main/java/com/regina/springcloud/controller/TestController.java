package com.regina.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Regina
 * @data 2019/11/14 20:23
 * @project 20191108-springcloud
 * @declaration:
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/test")
    public String test(){
        return port;
    }
}

package com.regina.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author Regina
 * @data 2019/11/13 15:46
 * @project 20191108-springcloud
 * @declaration:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.regina.springcloud.mapper")
public class ApplicationRun8083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class,args);
    }
}

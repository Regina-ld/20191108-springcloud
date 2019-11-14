package com.regina.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:Administrator regina
 * @ClassName ApplicationRun
 * @Description:
 * @Date 2019/11/11
 * @Verion V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.regina.springcloud.mapper")
public class ApplicationRun8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class,args);
    }

}



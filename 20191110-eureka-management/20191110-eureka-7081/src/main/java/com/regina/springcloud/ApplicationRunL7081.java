package com.regina.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:Administrator regina
 * @ClassName ApplicationRun
 * @Description:
 * @Date 2019/11/10
 * @Verion V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRunL7081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunL7081.class,args);
    }
}



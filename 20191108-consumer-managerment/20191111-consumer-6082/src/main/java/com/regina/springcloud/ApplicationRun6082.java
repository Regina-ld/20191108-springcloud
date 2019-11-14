package com.regina.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.misc.PostVMInitHook;

/**
 * @Author:Administrator regina
 * @ClassName com.regina.springcloud.ApplicationRun6082
 * @Description:
 * @Date 2019/11/11
 * @Verion V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}



package com.regina.springcloud.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:Administrator regina
 * @ClassName RestConfig
 * @Description:
 * @Date 2019/11/11
 * @Verion V1.0
 **/
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 使用随机的算法实现负载均衡
     * @return
     */

   /* @Bean
    public RandomRule randomRule(){
        return new RandomRule();
    }*/
}



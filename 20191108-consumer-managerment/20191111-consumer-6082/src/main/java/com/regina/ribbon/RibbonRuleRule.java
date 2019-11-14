package com.regina.ribbon;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author Regina
 * @data 2019/11/13 22:05
 * @project 20191108-springcloud
 * @declaration:
 */
@Configuration
public class RibbonRuleRule {
    @Bean
    public RandomRule randomRule(){
        return new RandomRule();
    }
}

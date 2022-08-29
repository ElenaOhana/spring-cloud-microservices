package com.jb.serviceA.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    /* ישמש אותנו כאשר יהיו ריבוי האינסטנסים */
    @LoadBalanced// This is the difference btw 1XK to 2XK
    @Bean /* factory method */
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

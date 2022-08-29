package com.jb.serviceA.controllers;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    RestTemplate restTemplate;

   /* @GetMapping("service/a")
    public String hello(){
        return  "service-A is calling to: " + restTemplate.getForObject("http://service-B/service/b", String.class);
    }*/

    @GetMapping("service/a")
    /* blocking operation. (Differ from concurrent Spring API/ Kafka/Rabbit) */
    /*@HystrixCommand(fallbackMethod = "fallback",
        commandProperties= {
                @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
                @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
                @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "25"),
        }
    )*/
    public String hello(){
        return  "service-A is calling to: " + restTemplate.getForObject("http://service-B/service/b", String.class);//(url, response-type)
    }

    public String fallback(Throwable e){
        return "Service A: Fallback Message - Service B is not available";/*"Ummmm.... Microservice-B is unavailable right now...";*/
    }
}

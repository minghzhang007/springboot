package com.lewis.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lewis0077 on 2017/7/18.
 */
@RestController
@SpringBootApplication
public class SpringbootApplication {

    @RequestMapping("/index")
    String index(){
        System.out.println("hello !");
        return "Hello ! Spring Boot !";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class,args);
    }
}






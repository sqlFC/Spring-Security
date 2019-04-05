package com.security.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhu
 * @date 2019/4/5 23:40
 */
@SpringBootApplication
@RestController
public class SecurityProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityProjectApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello security";
    }
}

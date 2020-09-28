package com.yezi.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }


    @GetMapping("/home")
    public String home() {
        System.out.println("------------------------------" + LocalDateTime.now());
        return "docker demo";
    }
}

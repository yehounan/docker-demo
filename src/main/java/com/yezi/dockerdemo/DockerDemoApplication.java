package com.yezi.dockerdemo;

import com.yezi.dockerdemo.bean.Cat;
import com.yezi.dockerdemo.bean.Dog;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;

    @GetMapping("/home")
    public String home() {
        System.out.println("------------------------------" + LocalDateTime.now());
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        return "docker demo";
    }
}

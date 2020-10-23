package com.yezi.dockerdemo.config;

import com.yezi.dockerdemo.bean.Cat;
import com.yezi.dockerdemo.bean.Dog;
import com.yezi.dockerdemo.bean.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: yezi
 * @Date: 2020/10/23 15:55
 */
@Configuration
public class Configeration {

    @Bean
    public Param param() {
        return new Param();
    }

    @Bean
    public Dog dog(Param param) {
        System.out.println(param);
        return new Dog();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }
}

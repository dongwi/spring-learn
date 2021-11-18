package com.dong.spring.ch09.config;

import com.dong.spring.ch09.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(value = {"com.dong.spring.ch09"})
public class MainConfig09 {
    @Bean
    public UserDao userDao1() {
        return new UserDao(1, "dong");
    }

    @Primary
    @Bean
    public UserDao userDao2() {
        return new UserDao(2, "dong");
    }
}

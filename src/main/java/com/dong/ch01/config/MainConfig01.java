package com.dong.ch01.config;

import com.dong.ch01.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig01 {
    @Bean
    public Person person() {
        return new Person("dongwei", 18);
    }
}

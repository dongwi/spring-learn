package com.dong.spring.config;

import com.dong.spring.ch01.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig05 {
    @Bean
    @Conditional(CustomCondition.class)
    public Person person() {
        return new Person("dongwei", 18);
    }
}

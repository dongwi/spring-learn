package com.dong.spring.ch01.config;

import com.dong.spring.ch01.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// configuration bean, which equas beans.xml
@Configuration
public class MainConfig01 {
    // function name is bean name by default, if you want change it, use @Bean(name = "person1")
    @Bean(name = "person1")
    public Person person() {
        return new Person("dongwei", 18);
    }
}

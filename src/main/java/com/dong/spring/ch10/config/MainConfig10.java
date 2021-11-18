package com.dong.spring.ch10.config;

import com.dong.spring.ch10.aop.Bread;
import com.dong.spring.ch10.aop.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//@ComponentScan(value = "com.dong.spring.ch10")
@Configuration
@EnableAspectJAutoProxy
public class MainConfig10 {
    @Bean
    public Bread bread() {
        return new Bread();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}


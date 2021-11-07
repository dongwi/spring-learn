package com.dong.ch10.config;

import com.dong.ch10.aop.Bread;
import com.dong.ch10.aop.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//@ComponentScan(value = "com.dong.ch10")
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


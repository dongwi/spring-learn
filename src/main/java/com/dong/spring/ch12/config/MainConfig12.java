package com.dong.spring.ch12.config;

import com.dong.spring.ch10.aop.Bread;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig12 {
    @Bean
    public Bread bread() {
        return new Bread();
    }
    @Bean
    public CustomBeanFactoryPostProcessor postProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }
    @Bean
    CustomBeanDefinitionRegistryPostProcessor customBeanDefinitionPostProcessor() {
        return new CustomBeanDefinitionRegistryPostProcessor();
    }
}

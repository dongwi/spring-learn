package com.dong.spring.ch07.config;

import com.dong.spring.ch01.bean.Person;
import com.dong.spring.ch07.bean.Computer;
import com.dong.spring.ch07.bean.Cpu;
import com.dong.spring.ch07.bean.Memory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Cpu.class})
public class MainConfig07 {
    @Bean
    public Person person() {
        return new Person("dongwei", 18);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Computer computer() {
        return new Computer();
    }

    @Bean(initMethod = "init", destroyMethod = "bean_annotation_destroy")
    public Memory memory() {
        return new Memory();
    }

    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}

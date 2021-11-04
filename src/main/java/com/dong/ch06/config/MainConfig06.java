package com.dong.ch06.config;

import com.dong.ch01.bean.Person;
import com.dong.ch06.bean.GoLanguage;
import com.dong.ch06.bean.PythonLanguage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {GoLanguage.class, PythonLanguage.class, CustomImportSelector.class, CustomImportBeanDefinitionRegistrar.class})
public class MainConfig06 {
    @Bean
    public Person person() {
        return new Person("dongwei", 18);
    }

    @Bean
    public CustomFactoryBean customFactoryBean() {
        return new CustomFactoryBean();
    }
}

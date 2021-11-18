package com.dong.spring.ch02;

import com.dong.spring.ch02.config.MainConfig02;
import com.dong.spring.ch02.config.MainConfig021;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02 {
    @Test
    public void test01() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig02.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(ac.getBean(beanDefinitionName));
        }
    }

    @Test
    public void test02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig021.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(ac.getBean(beanDefinitionName));
        }
    }
}

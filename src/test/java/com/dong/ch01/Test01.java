package com.dong.ch01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
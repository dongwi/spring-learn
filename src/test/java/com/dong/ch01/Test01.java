package com.dong.ch01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = cs.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("Bean name: "+ beanDefinitionName + ", bean info: " + cs.getBean(beanDefinitionName));
        }
    }
}
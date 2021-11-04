package com.dong.ch05;

import com.dong.ch05.config.MainConfig05;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test05 {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig05.class);
        for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
            System.out.println(ac.getBean(beanDefinitionName));
        }
    }
}

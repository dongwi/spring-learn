package com.dong.ch06;

import com.dong.ch06.config.MainConfig06;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test06 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig06.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}

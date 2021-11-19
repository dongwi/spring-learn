package com.dong.spring.ch12;

import com.dong.spring.ch12.config.MainConfig12;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test12 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig12.class);
        ac.close();
    }
}

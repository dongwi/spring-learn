package com.dong.ch07;

import com.dong.ch07.config.MainConfig07;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test07 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig07.class);
        System.out.println("context already created success........");
        ac.close();
        System.out.println("context already destroy success.......");
    }
}

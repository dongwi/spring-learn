package com.dong.spring.ch10;

import com.dong.spring.ch10.aop.Bread;
import com.dong.spring.ch10.config.MainConfig10;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test10 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig10.class);

        Bread bread = (Bread) ac.getBean("bread");
        bread.roast(10);
//        LogAspect logAspect = (LogAspect) ac.getBean("logAspect");
//        System.out.println(logAspect);

        ac.close();
    }
}

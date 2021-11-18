package com.dong.spring.ch10.aop;

import org.springframework.stereotype.Component;

@Component
public class Bread {
    public void roast(int time) {
        System.out.println("roast time duration: " + time);
    }
}

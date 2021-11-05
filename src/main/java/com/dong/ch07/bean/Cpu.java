package com.dong.ch07.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cpu {
    public Cpu() {
        System.out.println("CPU construction................");
    }

    @PostConstruct
    public void init() {
        System.out.println("CPU init..........");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CPU destroy...........");
    }

}

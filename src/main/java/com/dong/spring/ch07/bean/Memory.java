package com.dong.spring.ch07.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * fellow info will be print
 *
 * Memory constructor ..............
 * Memory init jsr250...........
 * Memory after properties set........................
 * Memory init...................
 *
 * Memory destroy jsr250..........
 * Memory  destroy...............
 * Memory bean annotation destroy..........
 */
public class Memory implements InitializingBean, DisposableBean {
    public Memory() {
        System.out.println("Memory constructor ..............");
    }

    public void init() {
        System.out.println("Memory init...................");
    }

    public void bean_annotation_destroy() {
        System.out.println("Memory bean annotation destroy..........");
    }

    @PostConstruct
    public void init_jsr250() {
        System.out.println("Memory init jsr250...........");
    }

    @PreDestroy
    public void destroy_jsr250() {
        System.out.println("Memory destroy jsr250..........");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Memory  destroy...............");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Memory after properties set........................");
    }
}

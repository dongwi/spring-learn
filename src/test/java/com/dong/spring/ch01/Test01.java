package com.dong.spring.ch01;

import com.dong.spring.ch01.config.MainConfig01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    /**
     * only one bean created declared in beans.xml
     *
     * output info:
     * Bean name: person, bean info: Person{name='dongwei', age=20}
     */
    @Test
    public void test01() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = cs.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("Bean name: "+ beanDefinitionName + ", bean info: " + cs.getBean(beanDefinitionName));
        }
    }

    /**
     * There are more bean created in the application context
     *
     * output info:
     * Bean name: org.springframework.context.annotation.internalConfigurationAnnotationProcessor, bean info: org.springframework.context.annotation.ConfigurationClassPostProcessor@47c81abf
     * Bean name: org.springframework.context.annotation.internalAutowiredAnnotationProcessor, bean info: org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@776a6d9b
     * Bean name: org.springframework.context.annotation.internalRequiredAnnotationProcessor, bean info: org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor@21d03963
     * Bean name: org.springframework.context.event.internalEventListenerProcessor, bean info: org.springframework.context.event.EventListenerMethodProcessor@1f760b47
     * Bean name: org.springframework.context.event.internalEventListenerFactory, bean info: org.springframework.context.event.DefaultEventListenerFactory@18ece7f4
     * Bean name: mainConfig01, bean info: com.dong.spring.ch01.config.MainConfig01$$EnhancerBySpringCGLIB$$b9179e63@3cce57c7
     * Bean name: person, bean info: Person{name='dongwei', age=18}
     */
    @Test
    public void test02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig01.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("Bean name: "+ beanDefinitionName + ", bean info: " + ac.getBean(beanDefinitionName));
        }
    }
}
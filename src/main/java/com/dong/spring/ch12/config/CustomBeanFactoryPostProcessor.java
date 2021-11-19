package com.dong.spring.ch12.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**
 *
 * BeanFactoryPostProcessor  针对BeanFactory bean, 在init方法的前后拦截
 * BeanPostProcessor  针对普通的bean，在init方法的前后进行拦截
 * BeanDefinitionRegistryPostProcessor  针对BeanDefinition bean，在init方法的前后拦截增强
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println( "CustomBeanFactoryPostProcessor#postProcessBeanFactory -> beanDefinitionName: "+ beanDefinitionName);
        }
    }
}

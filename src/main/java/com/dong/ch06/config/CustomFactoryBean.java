package com.dong.ch06.config;

import com.dong.ch06.bean.JavaLanguage;
import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<JavaLanguage> {
    @Override
    public JavaLanguage getObject() throws Exception {
        return new JavaLanguage();
    }

    @Override
    public Class<?> getObjectType() {
        return JavaLanguage.class;
    }
}
package com.dong.ch06.config;

import com.dong.ch06.bean.JsLanguage;
import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<JsLanguage> {
    @Override
    public JsLanguage getObject() throws Exception {
        return new JsLanguage();
    }

    @Override
    public Class<?> getObjectType() {
        return JsLanguage.class;
    }
}
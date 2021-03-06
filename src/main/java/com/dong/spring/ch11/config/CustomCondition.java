package com.dong.spring.ch11.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CustomCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getEnvironment().getProperty("os.name").contains("Windows")) {
            return true;
        }
        return false;
    }
}

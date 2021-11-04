package com.dong.ch06.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.dong.ch06.bean.CLanguage", "com.dong.ch06.bean.CLanguage"};
    }
}

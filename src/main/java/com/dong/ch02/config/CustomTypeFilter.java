package com.dong.ch02.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class CustomTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //get current class annotation info
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        System.out.println("------------------- "+ annotationMetadata.getAnnotationTypes());

        // filter controller annotation
        if (annotationMetadata.hasAnnotation("org.springframework.stereotype.Controller")) {
            return true;
        }

        // get current class meta data, such as classname, supper class, interface etc.
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        System.out.println(classMetadata.getClassName());

        // get current class resource
        Resource resource = metadataReader.getResource();
        return false;
    }
}

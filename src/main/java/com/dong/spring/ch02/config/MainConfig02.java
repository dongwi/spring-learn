package com.dong.spring.ch02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


/**
 *
 * actually value option equals basePackages.
 * use includeFilters annotation to include the class under basePackages, please ensure useDefaultFilters is false
 * use excludeFilters annotation to exclude the class under basePackages, and ensure useDefaultFilters is true too.
 */
@Configuration
@ComponentScan(value = "com.dong.spring.ch02", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
}, useDefaultFilters = false)
public class MainConfig02 {
}

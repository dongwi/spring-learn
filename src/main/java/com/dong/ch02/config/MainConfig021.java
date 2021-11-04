package com.dong.ch02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.dong.ch02", includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {CustomTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig021 {
}

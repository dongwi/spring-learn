package com.dong.ch08.config;

import com.dong.ch08.bean.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:/application.properties")
public class MainConfig08 {
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}

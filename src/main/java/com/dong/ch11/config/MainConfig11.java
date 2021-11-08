package com.dong.ch11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class MainConfig11 {
    @Bean
    public DataSource dataSource() {
        return null;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return null;
    }
}

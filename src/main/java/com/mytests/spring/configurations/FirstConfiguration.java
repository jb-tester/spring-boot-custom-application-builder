package com.mytests.spring.configurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com.mytests.spring.web.first")
@PropertySource("classpath:first.properties")
public class FirstConfiguration {

    @Bean
    public Bean1 bean1() {
        return new Bean1("first_b1");
    }



}

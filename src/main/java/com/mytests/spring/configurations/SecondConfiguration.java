package com.mytests.spring.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@EnableAutoConfiguration
@Configuration
@ComponentScan("com.mytests.spring.web.second")
@PropertySource("classpath:second.properties")
public class SecondConfiguration {

    @Bean
    public Bean1 bean1() {
        return new Bean1("second_b1");
    }



}

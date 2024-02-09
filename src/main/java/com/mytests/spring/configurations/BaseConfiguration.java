package com.mytests.spring.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BaseConfiguration {
    @Bean
    public Bean1 bean1() {
        return new Bean1("parent_b1");
    }

    @Bean
    public Bean2 bean2() {
        return new Bean2("parent_b2");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("--- beans in base context:");
            Arrays.sort(ctx.getBeanDefinitionNames());
            for (String beanName : ctx.getBeanDefinitionNames()) {
                System.out.println(beanName);
            }
            System.out.println("--------------------------");
        };
    }

}

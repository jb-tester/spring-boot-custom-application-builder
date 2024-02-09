package com.mytests.spring.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


public class SpringBootCustomApplicationBuilderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .parent(BaseConfiguration.class)
                .child(FirstConfiguration.class).web(WebApplicationType.SERVLET)
                .sibling(SecondConfiguration.class).web(WebApplicationType.SERVLET)
                .run(args);
    }

}

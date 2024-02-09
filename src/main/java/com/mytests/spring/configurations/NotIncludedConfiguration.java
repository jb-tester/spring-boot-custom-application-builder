package com.mytests.spring.configurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com.mytests.spring.notIncluded")
public class NotIncludedConfiguration {

    // this configuration is not added to context. It should not be consudered as well as the components scanned by this config
}

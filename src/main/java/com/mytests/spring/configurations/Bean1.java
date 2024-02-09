package com.mytests.spring.configurations;

import org.springframework.beans.factory.annotation.Value;

/**
 * *
 * <p>Created by irina on 2/9/2024.</p>
 * <p>Project: spring-boot-custom-application-builder</p>
 * *
 */
public class Bean1 {
    public Bean1(String id) {
        this.id = id;
    }

    String id;

    public String getId() {
        return id;
    }
}

package com.mytests.spring.web.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class FirstComponent {

    // should navigate to proper resource
    @Value("${props.component.name}")
    String id;

    public String getId() {
        return id;
    }

}

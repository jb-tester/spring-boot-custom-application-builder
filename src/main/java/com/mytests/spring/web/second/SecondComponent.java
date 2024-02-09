package com.mytests.spring.web.second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SecondComponent {

    // should navigate to proper resource
    @Value("secondCompo")
    String id;

    public String getId() {
        return id;
    }

}

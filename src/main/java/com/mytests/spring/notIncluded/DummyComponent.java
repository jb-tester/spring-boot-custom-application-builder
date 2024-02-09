package com.mytests.spring.notIncluded;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// this component is defined by the config that is not included to app context.
// should not be considered as context bean
@Component
public class DummyComponent {

    @Value("notAComponent")
    String id;

    public String getId() {
        return id;
    }

}

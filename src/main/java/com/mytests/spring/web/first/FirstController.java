package com.mytests.spring.web.first;

import com.mytests.spring.configurations.Bean1;
import com.mytests.spring.configurations.Bean2;
import com.mytests.spring.web.second.SecondComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.BeanNameViewResolver;


@RestController
@RequestMapping("/firstController")
public class FirstController {


    // should suggest bean in SecondConfiguration and in BaseConfiguration
    @Autowired
    private Bean1 bean1;

    // should navigate to bean in BaseConfiguration
    @Autowired
    private Bean2 bean2;

    // should navigate to component
    @Autowired
    private FirstComponent compo;

    // should not be available
    @Autowired(required = false)
    private SecondComponent secondCompo;

    @GetMapping("/test1")
    public String test1() {
        return "test1: "+bean1.getId() +" "+bean2.getId() +" "+compo.getId();
    }


}

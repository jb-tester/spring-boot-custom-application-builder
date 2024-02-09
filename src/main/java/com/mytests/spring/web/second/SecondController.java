package com.mytests.spring.web.second;

import com.mytests.spring.configurations.Bean1;
import com.mytests.spring.configurations.Bean2;
import com.mytests.spring.web.first.FirstComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/secondController")
public class SecondController {

    // should suggest bean in SecondConfiguration and in BaseConfiguration
    @Autowired
    private Bean1 bean1;

    // should navigate to bean in BaseConfiguration
    @Autowired
    private Bean2 bean2;

    // should navigate to component
    @Autowired
    private SecondComponent compo;

    // should not be available
    @Autowired(required = false)
    private FirstComponent firstComponent;


    @GetMapping("/test1")
    public String test1() {
       return  "test1: "+bean1.getId() +" "+bean2.getId() +" "+compo.getId();
    }


}

package com.example.springBasic.anotation.primaryAndQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {

    @Autowired
    @Qualifier("spainGreetingService")
    private GreetingService greetingService;

    public String greeting(String name){
        return greetingService.greet(name);
    }

}

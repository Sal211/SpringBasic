package com.example.springBasic.anotation.primaryAndQualifier.impl;

import com.example.springBasic.anotation.primaryAndQualifier.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("defaultGreetingService")
public class defualtGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "default greeting" + name;
    }
}

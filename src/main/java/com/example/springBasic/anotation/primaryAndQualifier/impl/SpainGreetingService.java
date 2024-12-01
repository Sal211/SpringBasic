package com.example.springBasic.anotation.primaryAndQualifier.impl;

import com.example.springBasic.anotation.primaryAndQualifier.GreetingService;
import org.springframework.stereotype.Service;

@Service("spainGreetingService")
public class SpainGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "spain greeting " + name;
    }
}

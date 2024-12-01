package com.example.springBasic.anotation.primaryAndQualifier.impl;

import com.example.springBasic.anotation.primaryAndQualifier.GreetingService;
import org.springframework.stereotype.Service;

@Service("englishGreetingService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "english greeting" + name;
    }
}

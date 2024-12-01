package com.example.springBasic.anotation.primaryAndQualifier;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    String greet(String name);
}

package com.example.springBasic.anotation.preDetroyAndPost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean {

    public LifecycleDemoBean() {
        System.out.println("Constructor: LifecycleDemoBean instance created.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct: Bean is initialized.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy: Bean is about to be destroyed.");
    }
}

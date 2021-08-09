package com.jeppu.services;

import org.springframework.stereotype.Service;

@Service("setter")
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}

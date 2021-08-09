package com.jeppu.services;

import org.springframework.stereotype.Service;

@Service("constructor")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

package com.jeppu.services;

import org.springframework.stereotype.Service;

@Service("property")
public class PropertyInjectedGreetingService implements GreetingService{
    public String sayGreeting(){
        return "Hello World - Property";
    }
}

package com.jeppu.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})     //if the "spring.profiles.active=ES" is not mentioned in application.properties, then this Service Class is treated as default
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - English Greeting";
    }
}

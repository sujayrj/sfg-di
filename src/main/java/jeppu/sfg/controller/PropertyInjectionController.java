package jeppu.sfg.controller;

import jeppu.sfg.service.GreetingService;
import jeppu.sfg.service.PropertyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
    @Qualifier("property")
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

package jeppu.pets.controller;

import jeppu.pets.service.PetGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetGreetingService petGreetingService;

    public PetController(PetGreetingService petGreetingService) {
        this.petGreetingService = petGreetingService;
    }

    public String sayHello(){
        return petGreetingService.sayGreeting();
    }
}

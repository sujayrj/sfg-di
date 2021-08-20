package jeppu.pets.service;


public class CatPetService implements PetGreetingService {

    @Override
    public String sayGreeting() {
        return "Cat Pet Service";
    }
}

package jeppu.pets.service;

public class DogPetService implements PetGreetingService{
    @Override
    public String sayGreeting() {
        return "Dog Pet Service";
    }
}

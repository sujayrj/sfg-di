package jeppu.sfg.service;

public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World --- Constructor Greeting Service";
    }
}

package jeppu.sfg.service;

public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World --- Property Greeting Service";
    }
}

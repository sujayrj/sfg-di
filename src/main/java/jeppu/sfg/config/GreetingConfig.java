package jeppu.sfg.config;

import jeppu.pets.service.CatPetService;
import jeppu.pets.service.DogPetService;
import jeppu.sfg.service.ConstructorGreetingService;
import jeppu.sfg.service.GreetingService;
import jeppu.sfg.service.PropertyGreetingService;
import jeppu.sfg.service.SetterGreetingService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"jeppu.pets", "jeppu.sfg"})
public class GreetingConfig {

    @Bean
    ConstructorGreetingService constructor(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService property(){
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setter(){
        return new SetterGreetingService();
    }

    @Profile({"cat"})
    @Bean
    CatPetService catPetService(){
        return new CatPetService();
    }

    @Profile({"dog"})
    @Bean
    DogPetService dogPetService(){
        return new DogPetService();
    }
}

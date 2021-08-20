package jeppu;

import jeppu.pets.controller.PetController;
import jeppu.sfg.controller.ConstructorInjectionController;
import jeppu.sfg.controller.PropertyInjectionController;
import jeppu.sfg.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("----- CONSTRUCTOR INJECTION -----");
        ConstructorInjectionController constructorInjectionController = context.getBean("constructorInjectionController", ConstructorInjectionController.class);
        System.out.println(constructorInjectionController.sayHello());

        System.out.println("----- PROPERTY INJECTION -----");
        PropertyInjectionController propertyInjectionController = context.getBean("propertyInjectionController", PropertyInjectionController.class);
        System.out.println(propertyInjectionController.sayHello());

        System.out.println("----- SETTER INJECTION -----");
        SetterInjectionController setterInjectionController = context.getBean("setterInjectionController", SetterInjectionController.class);
        System.out.println(setterInjectionController.sayHello());

        System.out.println("----- PET SERVICE USING PROFILES -----");
        PetController petController = context.getBean("petController", PetController.class);
        System.out.println(petController.sayHello());
    }


}

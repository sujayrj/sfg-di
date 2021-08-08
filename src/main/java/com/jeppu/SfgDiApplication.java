package com.jeppu;

import com.jeppu.controllers.ConstructorInjectedController;
import com.jeppu.controllers.MyController;
import com.jeppu.controllers.PropertyInjectedController;
import com.jeppu.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = context.getBean("myController", MyController.class);
        System.out.println(myController.sayHello());

        System.out.println("-----------Property");
        PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("-----------Setter");
        SetterInjectedController setterInjectedController = context.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-----------Constructor");
        ConstructorInjectedController constructorInjectedController = context.getBean("constructorInjectedController", ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());

    }

}

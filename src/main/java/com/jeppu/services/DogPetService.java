package com.jeppu.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog"})
@Service("dog")
public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dogs are the best";
    }
}

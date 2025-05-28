package com.example.today.common;

import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {

    public MexicanChef () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe() {
        return "Prepare muciacia nacios";
    }
}

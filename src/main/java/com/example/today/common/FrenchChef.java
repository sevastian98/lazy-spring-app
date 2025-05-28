package com.example.today.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {

    public FrenchChef () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare.. bechamel( Franch )";
    }
}

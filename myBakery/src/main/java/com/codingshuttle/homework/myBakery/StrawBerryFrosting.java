package com.codingshuttle.homework.myBakery;

import org.springframework.stereotype.Component;

@Component
public class StrawBerryFrosting implements Frosting{

    @Override
    public String getFrostingtype() {
        return "Strawberry Frosting";
    }
}

package com.codingshuttle.homework.myBakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingtype() {
        return "Chocolate Frosting";
    }
}

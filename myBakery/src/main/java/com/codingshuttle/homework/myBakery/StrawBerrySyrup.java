package com.codingshuttle.homework.myBakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawBerrySyrup implements Syrup{

    @Override
    public String getSyrupType() {
        return "StrawBerry Syrup";
    }
}

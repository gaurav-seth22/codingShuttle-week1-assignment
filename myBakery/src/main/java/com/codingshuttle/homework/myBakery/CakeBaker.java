package com.codingshuttle.homework.myBakery;

import org.springframework.stereotype.Component;



@Component
public class CakeBaker {

   /* @Autowired
    ChocolateFrosting cf;
    @Autowired
    StrawBerryFrosting sf;
    @Autowired
    ChocolateSyrup cs;
    @Autowired
    StrawBerrySyrup ss;*/

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }


    public void bakeCake(){

        System.out.println("Baking a cake with " + frosting.getFrostingtype() + " and " + syrup.getSyrupType());

    }
}

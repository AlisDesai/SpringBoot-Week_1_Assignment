package com.codingshuttle.Alis.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Syrup syrup;

    @Autowired
    Frosting frosting;

    public void cakeBaker(){
        System.out.println("Cake has started baking with Frosting "+frosting.getFrostingType() +" Syrup on it is "+syrup.getSyrupType());
    }
}

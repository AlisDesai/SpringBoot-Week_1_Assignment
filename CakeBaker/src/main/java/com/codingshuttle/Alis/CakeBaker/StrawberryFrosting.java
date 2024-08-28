package com.codingshuttle.Alis.CakeBaker;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType(){
        return "Strawberry";
    }

}

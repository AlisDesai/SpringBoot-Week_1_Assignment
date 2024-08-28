package com.codingshuttle.Alis.CakeBaker;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChoclateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}

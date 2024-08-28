package com.codingshuttle.Alis.CakeBaker;

import org.springframework.stereotype.Component;

@Component
public class ChoclateSyrup  implements Syrup {
    @Override
    public String getSyrupType() {
        return "Choclate";
    }
}

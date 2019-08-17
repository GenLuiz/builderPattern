package com.builder.builder.DAO;

import java.math.BigDecimal;

public class CheeseBurguerDirector {

    private ICheeseBurger builder;

    public CheeseBurguerDirector(ICheeseBurger builder){
        this.builder = builder;
    }

    public CheeseBurger construct(){
        return builder.setWeight(new BigDecimal(180))
                .setKetchup(true)
                .setMayonnaise(true)
                .setMustard(true)
                .build();
    }
}

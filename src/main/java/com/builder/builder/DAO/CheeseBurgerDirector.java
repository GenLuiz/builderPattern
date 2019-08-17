package com.builder.builder.DAO;

import java.math.BigDecimal;

public class CheeseBurgerDirector {

    private ICheeseBurger builder;

    public CheeseBurgerDirector(ICheeseBurger builder){
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

package com.builder.builder.Directors;

import com.builder.builder.DAO.CheeseBurger;
import com.builder.builder.Interfaces.ICheeseBurger;

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

    public CheeseBurger constructB(){
        return builder.setWeight(new BigDecimal(300))
                .setKetchup(false)
                .setMayonnaise(false)
                .setMustard(false)
                .build();
    }
}

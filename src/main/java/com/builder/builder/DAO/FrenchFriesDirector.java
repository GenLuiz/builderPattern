package com.builder.builder.DAO;

import java.math.BigDecimal;

public class FrenchFriesDirector {

    private IFrenchFries builder;

    public FrenchFriesDirector(IFrenchFries builder){
        this.builder = builder;
    }

    public FrenchFries construct(){
        return builder.setWeight(new BigDecimal(200))
                .setCheese(true)
                .build();
    }
}

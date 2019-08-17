package com.builder.builder.Directors;

import com.builder.builder.DAO.FrenchFries;
import com.builder.builder.Interfaces.IFrenchFries;

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

    public FrenchFries constructB() {
        return builder.setWeight(new BigDecimal(400))
                .setCheese(false)
                .build();
    }
}

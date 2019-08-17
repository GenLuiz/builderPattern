package com.builder.builder.Implementations;

import com.builder.builder.DAO.FrenchFries;
import com.builder.builder.Interfaces.IFrenchFries;

import java.math.BigDecimal;

public class FrenchFriesImp implements IFrenchFries {

    private FrenchFries frenchFriesTmp;

    public FrenchFriesImp (){
        frenchFriesTmp = new FrenchFries();
    }

    @Override
    public FrenchFries build() {
        FrenchFries frenchFries = new FrenchFries();
        frenchFries.setWeight(frenchFriesTmp.getWeight());
        frenchFries.setCheese(frenchFriesTmp.getCheese());
        return frenchFries;
    }

    @Override
    public IFrenchFries setWeight(BigDecimal weight) {
        frenchFriesTmp.setWeight(weight);
        return this;
    }

    @Override
    public IFrenchFries setCheese(Boolean cheese) {
        frenchFriesTmp.setCheese(cheese);
        return this;
    }
}

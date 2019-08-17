package com.builder.builder.DAO;

import java.math.BigDecimal;

public interface IFrenchFries {

    FrenchFries build();

    IFrenchFries setWeight(BigDecimal weight);
    IFrenchFries setCheese(boolean cheese);
}

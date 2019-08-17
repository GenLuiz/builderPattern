package com.builder.builder.Interfaces;

import com.builder.builder.DAO.FrenchFries;
import java.math.BigDecimal;

public interface IFrenchFries {
    FrenchFries build();

    IFrenchFries setWeight(BigDecimal weight);
    IFrenchFries setCheese(Boolean cheese);
}

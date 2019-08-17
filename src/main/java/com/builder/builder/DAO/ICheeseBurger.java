package com.builder.builder.DAO;

import java.math.BigDecimal;

public interface ICheeseBurger {
    CheeseBurger build();

     ICheeseBurger setWeight(BigDecimal weight);
     ICheeseBurger setKetchup(boolean ketchup);
     ICheeseBurger setMayonnaise(boolean mayonnaise);
     ICheeseBurger setMustard(boolean mustard);
}

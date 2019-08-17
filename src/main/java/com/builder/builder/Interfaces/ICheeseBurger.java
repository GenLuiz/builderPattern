package com.builder.builder.Interfaces;

import com.builder.builder.DAO.CheeseBurger;
import java.math.BigDecimal;

public interface ICheeseBurger {
    CheeseBurger build();

     ICheeseBurger setWeight(BigDecimal weight);
     ICheeseBurger setKetchup(Boolean ketchup);
     ICheeseBurger setMayonnaise(Boolean mayonnaise);
     ICheeseBurger setMustard(Boolean mustard);
}

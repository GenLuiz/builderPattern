package com.builder.builder.Implementations;

import com.builder.builder.DAO.CheeseBurger;
import com.builder.builder.Interfaces.ICheeseBurger;
import java.math.BigDecimal;

public class CheeseBurgerImp implements ICheeseBurger {

    private CheeseBurger cheeseBurgerTmp;

    public CheeseBurgerImp (){
        cheeseBurgerTmp = new CheeseBurger();
    }

    @Override
    public CheeseBurger build() {
        CheeseBurger cheeseBurger =  new CheeseBurger();
        cheeseBurger.setWeight(cheeseBurgerTmp.getWeight());
        cheeseBurger.setKetchup(cheeseBurgerTmp.getKetchup());
        cheeseBurger.setMayonnaise(cheeseBurgerTmp.getMayonnaise());
        cheeseBurger.setMustard(cheeseBurgerTmp.getMustard());
        return cheeseBurger;
    }

    @Override
    public ICheeseBurger setWeight(BigDecimal weight) {
        cheeseBurgerTmp.setWeight(weight);
        return this;
    }

    @Override
    public ICheeseBurger setKetchup(Boolean ketchup) {
        cheeseBurgerTmp.setKetchup(ketchup);
        return this;
    }

    @Override
    public ICheeseBurger setMayonnaise(Boolean mayonnaise) {
        cheeseBurgerTmp.setMayonnaise(mayonnaise);
        return this;
    }

    @Override
    public ICheeseBurger setMustard(Boolean mustard) {
        cheeseBurgerTmp.setMustard(mustard);
        return this;
    }
}

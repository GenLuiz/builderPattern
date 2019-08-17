package com.builder.builder.DAO;

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
    public ICheeseBurger setKetchup(boolean ketchup) {
        cheeseBurgerTmp.setKetchup(ketchup);
        return this;
    }

    @Override
    public ICheeseBurger setMayonnaise(boolean mayonnaise) {
        cheeseBurgerTmp.setMayonnaise(mayonnaise);
        return this;
    }

    @Override
    public ICheeseBurger setMustard(boolean mustard) {
        cheeseBurgerTmp.setMustard(mustard);
        return this;
    }
}

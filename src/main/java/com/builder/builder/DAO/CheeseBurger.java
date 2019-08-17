package com.builder.builder.DAO;

import java.math.BigDecimal;

public class CheeseBurger {

    private BigDecimal weight;
    private Boolean ketchup;
    private Boolean mayonnaise;
    private Boolean mustard;

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Boolean getKetchup() {
        return ketchup;
    }

    public void setKetchup(Boolean ketchup) {
        this.ketchup = ketchup;
    }

    public Boolean getMayonnaise() {
        return mayonnaise;
    }

    public void setMayonnaise(Boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
    }

    public Boolean getMustard() {
        return mustard;
    }

    public void setMustard(Boolean mustard) {
        this.mustard = mustard;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("Weight: "+ this.weight.toString()+"g");
        returnString.append(" Ketchup: "+ this.ketchup);
        returnString.append(" Mayonnaise: "+ this.mayonnaise);
        returnString.append(" Mustard: "+ this.mustard);
        return returnString.toString();
    }
}

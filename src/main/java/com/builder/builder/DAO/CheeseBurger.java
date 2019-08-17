package com.builder.builder.DAO;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CheeseBurger {

    private BigDecimal weight;
    private Boolean ketchup;
    private Boolean mayonnaise;
    private Boolean mustard;

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

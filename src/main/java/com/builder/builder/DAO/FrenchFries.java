package com.builder.builder.DAO;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class FrenchFries {

    private BigDecimal weight;
    private Boolean cheese;

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("French Fries: ");
        returnString.append("Weight: "+weight.toString()+"g");
        returnString.append(" Cheese: "+cheese);
        return returnString.toString();
    }
}

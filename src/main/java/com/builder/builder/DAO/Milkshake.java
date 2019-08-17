package com.builder.builder.DAO;

import lombok.Data;

@Data
public class Milkshake {

    private Boolean zest;

    @Override
    public String toString() {
        return "Milkshake: Zest: "+ zest;
    }
}

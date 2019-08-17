package com.builder.builder.Directors;

import com.builder.builder.DAO.Milkshake;
import com.builder.builder.Interfaces.IMilkshake;

public class MilkshakeDirector {

    private IMilkshake builder;

    public MilkshakeDirector(IMilkshake builder){
        this.builder = builder;
    }

    public Milkshake construct(){
        return builder.setZest(true)
                .build();
    }

    public Milkshake constructB() {
        return builder.setZest(false)
                .build();
    }
}

package com.builder.builder.Implementations;

import com.builder.builder.DAO.Milkshake;
import com.builder.builder.Interfaces.IMilkshake;

public class MilkshakeImp implements IMilkshake {

    private Milkshake milkshakeTmp;

    public MilkshakeImp (){
        milkshakeTmp = new Milkshake();
    }

    @Override
    public Milkshake build() {
        Milkshake milkshake = new Milkshake();
        milkshake.setZest(milkshakeTmp.getZest());
        return milkshake;
    }

    @Override
    public IMilkshake setZest(Boolean zest) {
        milkshakeTmp.setZest(zest);
        return this;
    }
}

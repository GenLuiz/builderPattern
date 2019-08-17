package com.builder.builder.Interfaces;

import com.builder.builder.DAO.Milkshake;

public interface IMilkshake {
    Milkshake build();

    IMilkshake setZest(Boolean zest);
}

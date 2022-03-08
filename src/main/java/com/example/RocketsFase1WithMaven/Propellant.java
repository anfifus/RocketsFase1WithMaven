package com.example.RocketsFase1WithMaven;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Propellant {
    private final int maxPower;

    public Propellant(@JsonProperty("numOfPropellant")int maxPower) throws Exception {
        checkPower(maxPower);
        this.maxPower = maxPower;
    }

    private void checkPower(int power) throws  Exception{
        if(power <= 0) throw new Exception("The propellant must have power");
    }

    public int getMaxPower() {
        return maxPower;
    }
}

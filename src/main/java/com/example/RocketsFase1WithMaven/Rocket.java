package com.example.RocketsFase1WithMaven;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rocket {
    private final String code;
    private final int numOfPropellant;

    public Rocket(@JsonProperty("code") String code,@JsonProperty("numOfPropellant") int numOfPropellant) throws Exception {
        checkCode(code);
        checkPropellant(numOfPropellant);
        this.code = code;
        this.numOfPropellant = numOfPropellant;
    }

    private void checkPropellant(int numOfPropellant) throws Exception{
        if(numOfPropellant<=0) throw new Exception("The rocket must have propellant");
    }

    private void checkCode(String code) throws Exception{
        if( code.length() != 8) throw new Exception("The format of the code is incorrect");
    }

    public String getCode() {
        return code;
    }

    public int getNumOfPropellant() {
        return numOfPropellant;
    }
}

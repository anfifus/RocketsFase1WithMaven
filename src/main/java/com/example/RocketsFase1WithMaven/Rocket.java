package com.example.RocketsFase1WithMaven;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private final String code;
    private final List<Propellant> propellantList = new ArrayList<>();

    public Rocket(@JsonProperty("code") String code) throws Exception {
        checkCode(code);
        this.code = code;
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

    public List<Propellant> getNumOfPropellant() {
        return propellantList;
    }
    public void addPropellant(Propellant newPropellant) {
        this.propellantList.add(newPropellant);
    }
}

package com.example.RocketsFase1WithMaven;

import java.util.ArrayList;
import java.util.List;

public class RocketService {
    private final List<Rocket> rockets = new ArrayList<>();


    public void addRocket(Rocket rocket){
        rockets.add(rocket);
    }
    public List<Rocket> showAll() throws Exception{
        checkRockets(rockets);
        return rockets;
    }

    private void checkRockets(List<Rocket> rockets) throws Exception {
        if(rockets.isEmpty()) throw new Exception("We don't have any rocket");
        else if(rockets.get(0).getPropellant().isEmpty()) throw new Exception("We don't have any propellant in rocket");
    }

    public Rocket addPropellant(String code,Propellant propellant){
        Rocket rocketWithPropellant = null;
        for (Rocket currentRocket:this.rockets) {
            if (currentRocket.getCode().contains(code)){
                currentRocket.addPropellant(propellant);
                rocketWithPropellant = currentRocket;
            }
        }
        return rocketWithPropellant;
    }
}

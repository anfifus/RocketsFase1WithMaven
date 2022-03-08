package com.example.RocketsFase1WithMaven;

import java.util.ArrayList;
import java.util.List;

public class RocketService {
    private final List<Rocket> rockets = new ArrayList<>();


    public void addRocket(Rocket rocket){
        rockets.add(rocket);
    }
    public List<Rocket> showAll(){
        return rockets;
    }
    public void addPropellant(Propellant propellant){

    }
}

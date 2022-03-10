package com.example.RocketsFase1WithMaven;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RocketController {
    private final RocketService rocketService = new RocketService();
    @PosttMapping("/rockets")
    public Rocket createRocket(@RequestBody Rocket newRocket){
        rocketService.addRocket(newRocket);
        return newRocket;
    }
    @GetMapping("/rockets")
    public List<Rocket> showRockets(){
        List<Rocket> rocketList = new ArrayList<>();
        try
        {
            rocketList = rocketService.showAll();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return rocketList;
    }
    @PostMapping("/rockets/{code}/propellant")
    public Rocket addPropellantInRocket(@PathVariable String code,@RequestBody Propellant newPropellant){
        Rocket rocketWithNewPropellant;
        rocketWithNewPropellant = rocketService.addPropellant(code,newPropellant);
        return rocketWithNewPropellant;
    }
}

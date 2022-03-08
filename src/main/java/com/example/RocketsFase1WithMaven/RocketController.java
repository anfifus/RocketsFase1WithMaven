package com.example.RocketsFase1WithMaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RocketController {
    private final RocketService rocketService = new RocketService();
    @GetMapping("/addRocket")
    public Rocket createRocket(@RequestBody Rocket newRocket){
        rocketService.addRocket(newRocket);
        return newRocket;
    }
    @PostMapping("/showAll")
    public List<Rocket> showRockets(){
        return  rocketService.showAll();
    }
}

package com.example.GameVault.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/fragments-demo")
    public String fragmentsDemo(){


        return "fragments-demo";
    }

}

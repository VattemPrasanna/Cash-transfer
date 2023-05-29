package com.groupprojects.cashtransfer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private-bank")
public class HomeController {

    @RequestMapping("/home")
    public String home(){

        return "Home page will be displayed here....";
    }
}

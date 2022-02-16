package com.ibs.litmusproject.HotelBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/login1")
    public String login(){
        return "login1";
    }
}

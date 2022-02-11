package com.ibs.litmusproject.HotelBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @RequestMapping("/signup")
    public String signUp() {
        return "signUp";
    }



    @RequestMapping("/welcome")
    public String signIn() {
        return "welcome";
    }
}

package com.ibs.litmusproject.HotelBooking.controller;

import com.ibs.litmusproject.HotelBooking.dao.UserRepository;
import com.ibs.litmusproject.HotelBooking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    UserRepository repo;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/adduser")
    public String addUser(User user){
        repo.save(user);
        return "login";  //adding signup details to the db
    }
}

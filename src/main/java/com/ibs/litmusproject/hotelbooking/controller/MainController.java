package com.ibs.litmusproject.hotelbooking.controller;

import com.ibs.litmusproject.hotelbooking.HotelUserDetails.UserLoginDetails;
import com.ibs.litmusproject.hotelbooking.model.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login() {
        return "login1";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/home")
    public String homePage() {
        return "index";
    }

    @PostMapping(value = "/loginsuccess")
    public String postLogin(Model model, HttpSession session) {

        // read principal out of security context and set it to session
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        validatePrinciple(authentication.getPrincipal());
        User loggedInUser = ((UserLoginDetails) authentication.getPrincipal()).getUserDetails();

        model.addAttribute("currentUserId", loggedInUser.getId());
        model.addAttribute("currentUser", loggedInUser.getEmail());
        return "redirect:/home";

    }

    private void validatePrinciple(Object principal) {
        if (!(principal instanceof UserLoginDetails)) {
            throw new IllegalArgumentException("Principal can not be null!");
        }
    }



    @RequestMapping("/result")
    public String searchHotel() {
        return "index";
    }

    @RequestMapping("/hoteldetails")
    public String viewDetails() {
        return "hoteldetails";
    }

    @RequestMapping("/bookhotel")

    public String bookHotel() {
        return "booking";
    }


    @RequestMapping("/checkout")
    public String paymentDetails() {

        return "checkout";
    }

}


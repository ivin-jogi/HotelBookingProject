package com.ibs.litmusproject.HotelBooking.controller;



import com.ibs.litmusproject.HotelBooking.service.UserService;
import com.ibs.litmusproject.HotelBooking.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showSignUp(Model model){
        return "signup";
    }
    @ModelAttribute("user")
    public UserDto userDto(){
        return new UserDto();
    }
    @PostMapping
    public String regUser(@ModelAttribute("user") UserDto userDto){
        userService.saveUser(userDto);
        return "redirect:/registration?success";
    }
}

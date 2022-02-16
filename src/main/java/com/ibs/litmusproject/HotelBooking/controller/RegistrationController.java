package com.ibs.litmusproject.HotelBooking.controller;

import com.ibs.litmusproject.HotelBooking.service.UserService;
import com.ibs.litmusproject.HotelBooking.web.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserService userService;


    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }

    @GetMapping
    public String showRegisterAccount() {
        return "registration";
    }

    @PostMapping
    public String registerAccount(@ModelAttribute("user") UserDto userDto) {

        userService.saveUser(userDto);
        return "redirect:/registration?success";
    }


}

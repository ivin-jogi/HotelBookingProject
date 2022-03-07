package com.ibs.litmusproject.hotelbooking.controller;


import com.ibs.litmusproject.hotelbooking.HotelUserDetails.UserLoginDetails;
import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.service.MyBookService;
import com.ibs.litmusproject.hotelbooking.web.dto.MyBookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MyBookService myBookService;

    @GetMapping("/login")
    public String login() {
        return "login1";
    }

    @GetMapping("/")
    public String home() {
        return "testresult";
    }

    @GetMapping("/home")
    public String homePage() {
        return "listhotel";
    }

    @PostMapping(value = "/loginsuccess")
    public String postLogin(Model model, HttpSession session) {
        // read principal out of security context and set it to session
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder
                .getContext().getAuthentication();
        validatePrinciple(authentication.getPrincipal());
        User loggedInUser = ((UserLoginDetails) authentication.getPrincipal()).getUserDetails();
        model.addAttribute("currentUserId", loggedInUser.getId());
        session.setAttribute("currentUserId", loggedInUser.getId());
        model.addAttribute("currentUser", loggedInUser.getEmail());
        return "redirect:/listhotel";
    }

    private void validatePrinciple(Object principal) {
        if (!(principal instanceof UserLoginDetails)) {
            throw new IllegalArgumentException("Principal can not be null!");
        }
    }

    @RequestMapping("/result")
    public String searchHotel() {
        return "testresult";
    }

    @RequestMapping("/hoteldetails")
    public String viewDetails() {
        return "hoteldetails";
    }

    @RequestMapping("/bookhotel")
    public String bookHotel() {
        return "checkout";
    }


    /*  @GetMapping("/mybooking")
     public ModelAndView getAllBookings() {
      ModelAndView mav = new ModelAndView("mybooking");
       mav.addObject("booklist", bookingrepo.findAll());


       return mav;
     }*/
    @GetMapping("/mybooking")
    public String bookings(Model model, HttpSession session) {
        Long currentUserId = (Long) session.getAttribute("currentUserId");
        List<MyBookDto> lstbook = new ArrayList<>();

        lstbook = myBookService.getMyBookList("" + currentUserId);

  /*MyBookDto bookDto=new MyBookDto();
  bookDto.setBookingId(1000);
  bookDto.setHotelName("Hotel Voyage");
  bookDto.setLocation("New York");
  bookDto.setCheckIn("2021-03-04");
  bookDto.setCheckOut("2021-03-15");
  lstbook.add(bookDto);

  MyBookDto bookDto1=new MyBookDto();
  bookDto1.setBookingId(2000);
  bookDto1.setHotelName("Hotel Atlanta");
  bookDto1.setLocation("Paris");
  bookDto1.setCheckIn("2022-02-04");
  bookDto1.setCheckOut("2022-02-15");
  lstbook.add(bookDto1);*/

        model.addAttribute("bookpage", lstbook);
        return "mybooking";
    }

}

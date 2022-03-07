package com.ibs.litmusproject.hotelbooking.controller;

import com.ibs.litmusproject.hotelbooking.service.BookingService;
import com.ibs.litmusproject.hotelbooking.web.dto.CheckOutUserDto;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bookhotel")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @ModelAttribute("userBooking")
    public CheckOutUserDto checkOutUserDto() {
        return new CheckOutUserDto();
    }

    @GetMapping
    public String showBookingRecord(@RequestParam("hotelid") String hotelId, Model model,
                                    HttpSession session) {
        session.setAttribute("hotelid", hotelId);
        CheckOutUserDto couserDto = new CheckOutUserDto();
        couserDto.setHotelId(hotelId);
        model.addAttribute("userBooking", couserDto);
        return "checkout";
    }

    @PostMapping
    public String BookingRecord(@ModelAttribute("userBooking") CheckOutUserDto checkOutUserDto,
                                Model model, HttpSession session) {
        Long currentUserId = (Long) session.getAttribute("currentUserId");
        String hotelId = (String) session.getAttribute("hotelid");
        System.out.println("hotelid=" + hotelId);
        System.out.println("currentUserId=" + currentUserId);
        checkOutUserDto.setUserId(currentUserId.toString());
        checkOutUserDto.setHotelId(hotelId);
        bookingService.saveBooking(checkOutUserDto);
        return "redirect:/listhotel?success";
    }

}

package com.ibs.litmusproject.hotelbooking.controller;
import com.ibs.litmusproject.hotelbooking.service.SearchDetailsService;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDetailDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelInfoController {

    private SearchDetailsService detailsService;

    public HotelInfoController(SearchDetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping("/hotelinfo")
    public String showResultDetail(@RequestParam("hotelid") String hotelId, Model model) {
        SearchDetailDto dto = detailsService.getPropertyDetailApi(hotelId);
        model.addAttribute("hotelinfo", dto);
        return "hotelinfo";
    }
}



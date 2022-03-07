package com.ibs.litmusproject.hotelbooking.controller;

import com.ibs.litmusproject.hotelbooking.service.SearchListService;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDto;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchResultDto;
import com.ibs.litmusproject.hotelbooking.web.dto.TestResultDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ListHotelController {

    SearchListService searchListService;

    public ListHotelController(SearchListService searchListService) {
        this.searchListService = searchListService;
    }

    @GetMapping("/testresult")
    public String greetingForm(Model model) {
        model.addAttribute("testresult", new TestResultDto());
        return "testresult";
    }

    @PostMapping("/testresult")
    public String greetingSubmit(@ModelAttribute TestResultDto testresultDto, Model model) {
        model.addAttribute("testresult", testresultDto);
        return "testresult";
    }

    @GetMapping("/listhotel")
    public String searchresult(Model model) {
        model.addAttribute("listhotel", new SearchDto());
        return "listhotel";
    }

    @PostMapping("/listhotel")
    public String searchresult(@ModelAttribute SearchDto searchDto, Model model) {
        model.addAttribute("listhotel", searchDto);
        model.addAttribute("notFound", null);
        //   System.out.println("checkIn Date: "+searchDto.getCheckIn());
        List<SearchResultDto> lst = new ArrayList<>();
        lst = searchListService.getPropertyListApi(searchDto.getDestinationId(), searchDto.getCheckIn(),
                searchDto.getCheckOut(), searchDto.getAdults());
        model.addAttribute("searchHotelResults", lst);
        return "listhotel";
    }
}

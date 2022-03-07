package com.ibs.litmusproject.hotelbooking.service;
import com.ibs.litmusproject.hotelbooking.model.CheckOutUser;
import com.ibs.litmusproject.hotelbooking.model.Hotel;
import com.ibs.litmusproject.hotelbooking.model.Location;
import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.repository.BookingRepository;
import com.ibs.litmusproject.hotelbooking.repository.HotelRepository;
import com.ibs.litmusproject.hotelbooking.repository.LocationRepository;
import com.ibs.litmusproject.hotelbooking.repository.UserRepository;
import com.ibs.litmusproject.hotelbooking.web.dto.CheckOutUserDto;
import com.ibs.litmusproject.hotelbooking.web.dto.MyBookDto;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDetailDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.ibs.litmusproject.hotelbooking.web.dto.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyBookService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private LocationRepository locRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SearchDetailsService detailsService;


    /* @Override
     @Transactional
     public CheckOutUser saveBooking(CheckOutUserDto checkOutDto) {
        *//* CheckOutUser userBooking = new CheckOutUser(checkOutDto.getFirstName(), checkOutDto.getLastName(),
                checkOutDto.getEmail(), checkOutDto.getMobile(), checkOutDto.getPassengers(), checkOutDto.getCheckIn(),
                checkOutDto.getCheckOut(), checkOutDto.getUserId(), checkOutDto.getHotelId(), new Date());*//*
        CheckOutUser userBooking = new CheckOutUser();
        userBooking.setFirstName(checkOutDto.getFirstName());
        userBooking.setLastName(checkOutDto.getLastName());
        userBooking.setEmail(checkOutDto.getEmail());
        userBooking.setMobile(checkOutDto.getMobile());
        userBooking.setCheckIn(checkOutDto.getCheckIn());
        userBooking.setCheckOut(checkOutDto.getCheckOut());
        userBooking.setCreatedDate(new Date());
        // userBooking.setPassengers("N/A");
        userBooking.setPassengers(checkOutDto.getPassengers());
        SearchDetailDto dto = detailsService.getPropertyDetailApi(checkOutDto.getHotelId());

        Hotel hotel = hotelRepository.findByHotelId(checkOutDto.getHotelId());
        if(null==hotel){
            hotel = new Hotel();
            hotel.setHotelId(checkOutDto.getHotelId());
            // hotel.setHotelNAme(dto.getOverview().getTitle());
            hotel.setHotelNAme(dto.getPropertyDescription().get(0).getName());

        }

        Location loc = locRepository.findByDestinationId("1");

        if(null==loc){
            loc = new Location();
            loc.setDestinationId("1");
            loc.setDestinationName("New York");
        }
        List<Location> lstLoc = new ArrayList<>();
        lstLoc.add(loc);
        List<Hotel> lstHotel = new ArrayList<>();
        hotel.setLocations(lstLoc);
        lstHotel.add(hotel);
        userBooking.setHotels(lstHotel);

        User usr = userRepository.getById(Long.valueOf(checkOutDto.getUserId()));
        userBooking.setUser(usr);
        return bookingRepository.save(userBooking);
    }*/
    private MyBookDto convertBookingToDto(CheckOutUser model){
        MyBookDto dto=new MyBookDto();

        dto.setBookingId(model.getId());
        dto.setCreatedDate(String.valueOf(model.getCreatedDate()));
        dto.setHotelName(model.getHotels().get(0).getHotelNAme());
        dto.setLocation(model.getHotels().get(0).getLocations().get(0).getDestinationName());
        dto.setCheckIn(String.valueOf(model.getCheckIn()));
        dto.setCheckOut(String.valueOf(model.getCheckOut()));
        return dto;
    }

    private int myBookSort(CheckOutUser o1,CheckOutUser o2){
        if(o1.getCreatedDate().getTime()<=o2.getCreatedDate().getTime()){
            return 1;
        }
        else {
            return -1;
        }
    }

    public List<MyBookDto> getMyBookList(String currentUserId){
        List<MyBookDto> lstMyBookDto=null;
        List<CheckOutUser> lstBooking=null;
        if(null!=currentUserId && currentUserId.length()>0){
            User usr = userRepository.getById(Long.valueOf(currentUserId));
            if(null!=usr){
                lstBooking=bookingRepository.findByUser(usr);
            }

        }
        if(null!=lstBooking && lstBooking.size()>0){

            lstBooking.sort(this::myBookSort);
            lstMyBookDto=lstBooking.stream().map(this::convertBookingToDto).collect(Collectors.toList());
        }

        // lstMyBookDto=lstMyBookDto.sort((o1,o2)-> {return o1.getCheckIn().compare(o2.getCheckIn());});
        return lstMyBookDto;
    }
}

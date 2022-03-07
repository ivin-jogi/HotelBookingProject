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
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDetailDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibs.litmusproject.hotelbooking.web.dto.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingServiceImpl implements BookingService {

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


    @Override
    @Transactional
    public CheckOutUser saveBooking(CheckOutUserDto checkOutDto) {
       /* CheckOutUser userBooking = new CheckOutUser(checkOutDto.getFirstName(), checkOutDto.getLastName(),
                checkOutDto.getEmail(), checkOutDto.getMobile(), checkOutDto.getPassengers(), checkOutDto.getCheckIn(),
                checkOutDto.getCheckOut(), checkOutDto.getUserId(), checkOutDto.getHotelId(), new Date());*/
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

        Location loc = locRepository.findByDestinationId(dto.getPdpheader().getDestinationId());
      //  Location loc = locRepository.findByDestinationId(dto.getPropertyDescription().get(0).getAddress());

        if(null==loc){
            loc = new Location();
            loc.setDestinationId(dto.getPdpheader().getDestinationId());
            loc.setDestinationName(dto.getPdpheader().getHotelLocationDto().getLocationName());
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
    }
}

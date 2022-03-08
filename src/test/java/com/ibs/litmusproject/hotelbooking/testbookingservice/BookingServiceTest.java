package com.ibs.litmusproject.hotelbooking.testbookingservice;


import com.ibs.litmusproject.hotelbooking.model.CheckOutUser;
import com.ibs.litmusproject.hotelbooking.model.Hotel;
import com.ibs.litmusproject.hotelbooking.model.Location;
import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.repository.BookingRepository;
import com.ibs.litmusproject.hotelbooking.repository.HotelRepository;
import com.ibs.litmusproject.hotelbooking.repository.LocationRepository;
import com.ibs.litmusproject.hotelbooking.repository.UserRepository;
import com.ibs.litmusproject.hotelbooking.service.BookingService;
import com.ibs.litmusproject.hotelbooking.service.BookingServiceImpl;
import com.ibs.litmusproject.hotelbooking.service.SearchDetailsService;
import com.ibs.litmusproject.hotelbooking.service.UserServiceImpl;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDetailDto;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BookingServiceImpl.class)
public class BookingServiceTest {

    @MockBean
    private BookingRepository mockBookRepo;
    @MockBean
    private HotelRepository mockHotelRepo;
    @MockBean
    private LocationRepository mockLocationRepo;
    @MockBean
    private UserRepository mockUserRepo;
    @MockBean
    private SearchDetailsService mockSearchDetailService;
    @Autowired
    private BookingService bookservice;

    @Test
    public void testBookingService(){
        CheckOutUser checkOutUser=new CheckOutUser();
        checkOutUser.setFirstName("Harry");
        checkOutUser.setLastName("Potter");
        checkOutUser.setEmail("harry123@gmail.com");
        checkOutUser.setMobile("1426374890");
        checkOutUser.setCreatedDate(new Date());
        checkOutUser.setPassengers("2");
        checkOutUser.setCheckIn(new Date(2022-03-04));
        checkOutUser.setCheckOut(new Date(2022-03-10));

       // SearchDetailDto dto=new SearchDetailDto();
        SearchDetailDto dto= mockSearchDetailService.getPropertyDetailApi("1234");
        Hotel hotel=new Hotel();
         hotel=mockHotelRepo.findByHotelId("1234");
      //  Mockito.when(mockHotelRepo.findByHotelId(hotel.getHotelId()).thenReturn("1234"));

        if(null==hotel){
            hotel = new Hotel();
            hotel.setHotelId("1234");
            hotel.setHotelNAme("Hotel Voyage");

        }

       Location loc= new Location();
       loc=mockLocationRepo.findByDestinationId("1");

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
        checkOutUser.setHotels(lstHotel);

        User user= new User();
        mockUserRepo.getById(1L);
        checkOutUser.setUser(user);
        System.out.println(checkOutUser.getFirstName());
        Mockito.when(mockBookRepo.save(checkOutUser)).thenReturn(checkOutUser);


        CheckOutUser updatedCheckOUt=mockBookRepo.save(checkOutUser);
      assertThat(updatedCheckOUt.getFirstName()).isEqualTo(checkOutUser.getFirstName());
        assertThat(updatedCheckOUt.getUser()).isEqualTo(checkOutUser.getUser());
    }


}

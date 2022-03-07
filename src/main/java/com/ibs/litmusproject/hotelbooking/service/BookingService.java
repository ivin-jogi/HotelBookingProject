package com.ibs.litmusproject.hotelbooking.service;

import com.ibs.litmusproject.hotelbooking.model.CheckOutUser;
import com.ibs.litmusproject.hotelbooking.web.dto.CheckOutUserDto;

//to save booking

public interface BookingService {

    CheckOutUser saveBooking(CheckOutUserDto checkOutDto);
}

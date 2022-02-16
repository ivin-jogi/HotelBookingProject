package com.ibs.litmusproject.HotelBooking.service;

import com.ibs.litmusproject.HotelBooking.model.User;
import com.ibs.litmusproject.HotelBooking.web.dto.UserDto;

public interface UserService   {
    User saveUser(UserDto userDto);


}

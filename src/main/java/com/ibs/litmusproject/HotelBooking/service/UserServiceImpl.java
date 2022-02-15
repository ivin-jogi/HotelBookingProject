package com.ibs.litmusproject.HotelBooking.service;

import com.ibs.litmusproject.HotelBooking.model.User;
import com.ibs.litmusproject.HotelBooking.repository.UserRepository;
import com.ibs.litmusproject.HotelBooking.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Override
    public User saveUser(UserDto userDto) {
        User user = new User(userDto.getFirstName(), userDto.getLastName(),
                userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()));

        return userRepo.save(user);
    }
}








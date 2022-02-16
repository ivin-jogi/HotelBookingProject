package com.ibs.litmusproject.HotelBooking.service;

import com.ibs.litmusproject.HotelBooking.model.Authority;
import com.ibs.litmusproject.HotelBooking.model.AuthorityType;
import com.ibs.litmusproject.HotelBooking.model.User;
import com.ibs.litmusproject.HotelBooking.repository.AuthorityRepository;
import com.ibs.litmusproject.HotelBooking.repository.UserRepository;
import com.ibs.litmusproject.HotelBooking.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(UserDto userdto) {
        User user = new User(userdto.getFirstName(), userdto.getLastName(), userdto.getEmail(), passwordEncoder.encode(userdto.getPassword()), new Date());
        Set<Authority> authorities = Collections.singleton(authorityRepository.findByName(AuthorityType.ROLE_USER));
        user.setAuthorities(authorities);
        return userRepository.save(user);
    }


}
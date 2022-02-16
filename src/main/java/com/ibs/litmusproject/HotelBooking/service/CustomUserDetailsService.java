package com.ibs.litmusproject.HotelBooking.service;

import com.ibs.litmusproject.HotelBooking.HotelUserDetails.UserLoginDetails;
import com.ibs.litmusproject.HotelBooking.model.User;
import com.ibs.litmusproject.HotelBooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }

        return new UserLoginDetails(user);
    }

}


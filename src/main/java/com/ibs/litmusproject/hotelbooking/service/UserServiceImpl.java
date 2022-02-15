package com.ibs.litmusproject.hotelbooking.service;


import com.ibs.litmusproject.hotelbooking.domain.BookingUsersDetails;
import com.ibs.litmusproject.hotelbooking.model.Role;
import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.repository.UserRepository;
import com.ibs.litmusproject.hotelbooking.web.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl( UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(UserDto userdto) {
        User user = new User(userdto.getFirstName(),userdto.getLastName(),userdto.getEmail(), passwordEncoder.encode(userdto.getPassword()),Arrays.asList(new Role("ROLE_USER")) );
        return userRepository.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }
    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
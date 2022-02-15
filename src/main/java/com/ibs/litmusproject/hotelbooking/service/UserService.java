package com.ibs.litmusproject.hotelbooking.service;


import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.web.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
User save(UserDto userdto);
}

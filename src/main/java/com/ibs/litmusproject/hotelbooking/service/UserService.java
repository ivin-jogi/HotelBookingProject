package com.ibs.litmusproject.hotelbooking.service;

import com.ibs.litmusproject.hotelbooking.model.User;
import com.ibs.litmusproject.hotelbooking.web.dto.UserDto;

public interface UserService {
    User saveUser(UserDto userdto);
}

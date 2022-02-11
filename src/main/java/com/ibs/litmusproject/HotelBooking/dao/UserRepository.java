package com.ibs.litmusproject.HotelBooking.dao;

import com.ibs.litmusproject.HotelBooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

package com.ibs.litmusproject.HotelBooking.repository;

import com.ibs.litmusproject.HotelBooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

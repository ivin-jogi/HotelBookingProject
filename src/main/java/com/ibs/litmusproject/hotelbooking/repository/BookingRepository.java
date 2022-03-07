package com.ibs.litmusproject.hotelbooking.repository;


import com.ibs.litmusproject.hotelbooking.model.CheckOutUser;
import com.ibs.litmusproject.hotelbooking.model.Hotel;
import com.ibs.litmusproject.hotelbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//add method to fetch by userid
@Repository
public interface BookingRepository extends JpaRepository<CheckOutUser, Integer> {
    List<CheckOutUser> findByUser(User user);
}

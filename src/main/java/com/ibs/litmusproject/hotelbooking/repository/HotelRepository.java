package com.ibs.litmusproject.hotelbooking.repository;

import com.ibs.litmusproject.hotelbooking.model.Authority;
import com.ibs.litmusproject.hotelbooking.model.AuthorityType;
import com.ibs.litmusproject.hotelbooking.model.CheckOutUser;
import com.ibs.litmusproject.hotelbooking.model.Hotel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

  //@Query(value="select s from Hotel s where s.hotel_id=:hotelId")
  //Hotel findByHotelId(@Param("hotelId") String hotelId);
  Hotel findByHotelId(String hotelId);
}

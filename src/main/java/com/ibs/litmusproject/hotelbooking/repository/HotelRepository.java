package com.ibs.litmusproject.hotelbooking.repository;

import com.ibs.litmusproject.hotelbooking.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

  //@Query(value="select s from Hotel s where s.hotel_id=:hotelId")
  //Hotel findByHotelId(@Param("hotelId") String hotelId);
  Hotel findByHotelId(String hotelId);
}

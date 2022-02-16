package com.ibs.litmusproject.HotelBooking.repository;

import com.ibs.litmusproject.HotelBooking.model.Authority;
import com.ibs.litmusproject.HotelBooking.model.AuthorityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Integer> {
    Authority findByName(AuthorityType type);
}

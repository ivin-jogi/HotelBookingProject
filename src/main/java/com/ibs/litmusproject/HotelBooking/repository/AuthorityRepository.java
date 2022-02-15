package com.ibs.litmusproject.HotelBooking.repository;

import com.ibs.litmusproject.HotelBooking.model.Authority;
import com.ibs.litmusproject.HotelBooking.model.AuthorityType;

public interface AuthorityRepository {
    Authority findByName(AuthorityType type);
}

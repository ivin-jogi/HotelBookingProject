package com.ibs.litmusproject.hotelbooking.repository;


import com.ibs.litmusproject.hotelbooking.model.Hotel;
import com.ibs.litmusproject.hotelbooking.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

  Location findByDestinationId(String locId);
}

package com.ibs.litmusproject.hotelbooking.repository;

import com.ibs.litmusproject.hotelbooking.model.Authority;
import com.ibs.litmusproject.hotelbooking.model.AuthorityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Integer> {
    Authority findByName(AuthorityType type);
}

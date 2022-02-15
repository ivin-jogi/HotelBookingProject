package com.ibs.litmusproject.hotelbooking.repository;


import com.ibs.litmusproject.hotelbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
 User findByEmail(String email);
}

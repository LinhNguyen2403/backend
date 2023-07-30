package com.example.flexproject07.repository;

import com.example.flexproject07.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users ORDER BY RAND() LIMIT 1", nativeQuery = true)
    User findRandomUser();

    User findByUsername(String username);
    User findByEmail(String email);


}

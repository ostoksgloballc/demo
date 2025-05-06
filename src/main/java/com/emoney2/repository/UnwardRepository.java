package com.emoney2.repository;


import com.emoney2.model.Unward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnwardRepository extends JpaRepository<Unward, Long> {
    Optional<Unward> findByEmailOrPhoneNumber(String email,String phone);
}

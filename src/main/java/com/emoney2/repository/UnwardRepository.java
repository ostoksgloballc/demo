package com.emoney2.repository;


import com.emoney2.model.Unward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnwardRepository extends JpaRepository<Unward, Long> {

}

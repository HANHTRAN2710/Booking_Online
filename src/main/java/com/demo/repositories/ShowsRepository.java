package com.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Shows;

@Repository
public interface ShowsRepository extends JpaRepository<Shows, Integer> {
	
}

package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Cinema;
import com.demo.entities.Hall;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
	
	boolean existsByName(String name);
	
	@Query("from Cinema where city.id = :cityid")
	public List<Cinema> findCinemabyCityId(@Param("cityid") int cityid);
}

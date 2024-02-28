package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Cinema;

@Repository
public interface CinemaRepository extends CrudRepository<Cinema, Integer> {
	@Query("from Cinema where city.id = :cityid")
	public List<Cinema> findCinemasByCityId(@Param("cityid") int cityid);
}
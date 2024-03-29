package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.entities.Blogs;
import com.demo.entities.City;
import com.demo.entities.Hall;

public interface BookingRepository  extends CrudRepository<Hall, Integer>{
	
	@Query("from Hall where cinema.id = :cinemaid")
	public List<Hall> findHallsByCinemaId(@Param("cinemaid") int cinemaid);
	
	@Query("from Hall where id = :id")
	public Hall findHallbyId(@Param("id") int id);

}

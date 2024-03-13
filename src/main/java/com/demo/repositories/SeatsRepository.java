package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.entities.Movie;
import com.demo.entities.Seats;







public interface SeatsRepository  extends CrudRepository<Seats, Integer>{
	
	@Query("Select count(*) from Seats where hall.id=:hallid") 
	public Integer countseatsByHallid(@Param("hallid") int hallid); 

}
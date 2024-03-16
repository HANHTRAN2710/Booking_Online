package com.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Shows;

@Repository
public interface ShowsRepository extends JpaRepository<Shows, Integer> {
	 
	@Query("from Shows where movie.id =:movie_id order by id") 
	public List<Shows> ShowsbyMovieid(@Param("movie_id") int movie_id); 
	
	@Query("from Shows where id =:id") 
	public Shows findShowsById(@Param("id") int id); 
}

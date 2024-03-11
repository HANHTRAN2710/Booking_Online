package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.demo.entities.Blogs;
import com.demo.entities.City;







public interface BlogsRepository  extends CrudRepository<Blogs, Integer>{
	
	@Query("from Blogs order by id DESC ")
	public List<Blogs> findByAll();

}
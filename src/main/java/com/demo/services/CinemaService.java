package com.demo.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.entities.Cinema;
import com.demo.entities.City;
import com.demo.entities.Movie;
import com.demo.entities.Role;




public interface CinemaService {
	public boolean save(Cinema cinema);
	
}
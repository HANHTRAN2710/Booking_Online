package com.demo.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.demo.dtos.ShowSeatsDTO;
import com.demo.dtos.ShowSeatsOrderingStatus;
import com.demo.entities.Account;
import com.demo.entities.Booking;
import com.demo.entities.BookingDetails;
import com.demo.entities.Hall;
import com.demo.entities.Seats;
import com.demo.entities.Shows;
import com.demo.enums.SeatOrderingStatus;
import com.demo.helpers.MapUtils;
import com.demo.repositories.BookingDetailRepository;
import com.demo.repositories.BookingRepository;
import com.demo.repositories.FoodDetailRepository;
import com.demo.repositories.HallRepository;
import com.demo.repositories.MovieRepository;
import com.demo.repositories.SeatsRepository;
import com.demo.repositories.ShowsRepository;
import com.demo.services.BookingDetailsService;
import com.demo.services.BookingService;
import com.demo.services.FoodDetailsService;
import com.demo.services.HallService;
import com.demo.services.ShowService;

@Service
public class FoodDetailsServiceImpl implements FoodDetailsService {
	@Autowired
	private FoodDetailRepository foodDetailRepository;

	@Override
	public Integer incomefromFood() {
		Integer sum = foodDetailRepository.IncomeFromFood();
		return sum != null ? sum : 0;
	}

}

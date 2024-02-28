package com.demo.entities;
// Generated Feb 26, 2024, 2:16:25 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

/**
 * MovieShow generated by hbm2java
 */
@Entity
@Table(name = "movie_show")
public class MovieShow implements java.io.Serializable {

	private Integer id;
	private Movie movie;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startDate;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date endDate;
	private Set<ShowSeat> showSeats = new HashSet<ShowSeat>(0);

	public MovieShow() {
	}

	public MovieShow(Movie movie, Date startDate, Date endDate) {
		this.movie = movie;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public MovieShow(Movie movie, Date startDate, Date endDate, Set<ShowSeat> showSeats) {
		this.movie = movie;
		this.startDate = startDate;
		this.endDate = endDate;
		this.showSeats = showSeats;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id", nullable = false)
	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date", nullable = false, length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date", nullable = false, length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movieShow")
	public Set<ShowSeat> getShowSeats() {
		return this.showSeats;
	}

	public void setShowSeats(Set<ShowSeat> showSeats) {
		this.showSeats = showSeats;
	}

}
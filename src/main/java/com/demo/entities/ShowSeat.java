package com.demo.entities;
// Generated Feb 26, 2024, 2:16:25 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * ShowSeat generated by hbm2java
 */
@Entity
@Table(name = "show_seat")
public class ShowSeat implements java.io.Serializable {

	private Integer id;
	private MovieShow movieShow;
	private Seat seat;
	private double price;
	private Set<BookingDetails> bookingDetailses = new HashSet<BookingDetails>(0);

	public ShowSeat() {
	}

	public ShowSeat(MovieShow movieShow, Seat seat, double price) {
		this.movieShow = movieShow;
		this.seat = seat;
		this.price = price;
	}

	public ShowSeat(MovieShow movieShow, Seat seat, double price, Set<BookingDetails> bookingDetailses) {
		this.movieShow = movieShow;
		this.seat = seat;
		this.price = price;
		this.bookingDetailses = bookingDetailses;
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
	@JoinColumn(name = "show_id", nullable = false)
	public MovieShow getMovieShow() {
		return this.movieShow;
	}

	public void setMovieShow(MovieShow movieShow) {
		this.movieShow = movieShow;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_id", nullable = false)
	public Seat getSeat() {
		return this.seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "showSeat")
	public Set<BookingDetails> getBookingDetailses() {
		return this.bookingDetailses;
	}

	public void setBookingDetailses(Set<BookingDetails> bookingDetailses) {
		this.bookingDetailses = bookingDetailses;
	}

}

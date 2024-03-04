package com.demo.entities;
// Generated Mar 3, 2024, 9:42:09 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * Seat generated by hbm2java
 */
@Entity
@Table(name = "seat")
public class Seat implements java.io.Serializable {

	private Integer seatId;
	private Hall hall;
	private int seatNumber;
	private Set<BookingDetails> bookingDetailses = new HashSet<BookingDetails>(0);

	public Seat() {
	}

	public Seat(Hall hall, int seatNumber) {
		this.hall = hall;
		this.seatNumber = seatNumber;
	}

	public Seat(Hall hall, int seatNumber, Set<BookingDetails> bookingDetailses) {
		this.hall = hall;
		this.seatNumber = seatNumber;
		this.bookingDetailses = bookingDetailses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "seat_id", unique = true, nullable = false)
	public Integer getSeatId() {
		return this.seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hall_id", nullable = false)
	public Hall getHall() {
		return this.hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	@Column(name = "seat_number", nullable = false)
	public int getSeatNumber() {
		return this.seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seat")
	public Set<BookingDetails> getBookingDetailses() {
		return this.bookingDetailses;
	}

	public void setBookingDetailses(Set<BookingDetails> bookingDetailses) {
		this.bookingDetailses = bookingDetailses;
	}

}

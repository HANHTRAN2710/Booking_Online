package com.demo.entities;
// Generated Mar 8, 2024, 11:16:40 AM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * Voucher generated by hbm2java
 */
@Entity
@Table(name = "voucher")
public class Voucher implements java.io.Serializable {

	private Integer id;
	private String name;
	private Double discount;
	private Date expiry;
	private Set<Booking> bookings = new HashSet<Booking>(0);

	public Voucher() {
	}

	public Voucher(String name, Double discount, Date expiry) {
		this.name = name;
		this.discount = discount;
		this.expiry = expiry;
	}

	public Voucher(String name, Double discount, Date expiry, Set<Booking> bookings) {
		this.name = name;
		this.discount = discount;
		this.expiry = expiry;
		this.bookings = bookings;
	}

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "discount", nullable = false, precision = 22, scale = 0)
	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expiry", nullable = false, length = 10)
	public Date getExpiry() {
		return this.expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "voucher_booking", joinColumns = {
	        @JoinColumn(name = "voucher_id", nullable = false, updatable = false, insertable = false) },
	        inverseJoinColumns = {
	                @JoinColumn(name = "booking_id", nullable = false, updatable = false, insertable = false) })
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

}

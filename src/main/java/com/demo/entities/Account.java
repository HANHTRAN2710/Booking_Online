package com.demo.entities;
// Generated Feb 26, 2024, 2:16:25 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account")
public class Account implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private String email;
	private String phone;
	private String address;
	private boolean status;
	private Set<Booking> bookings = new HashSet<Booking>(0);
	private Set<Role> roles = new HashSet<Role>(0);
	private Set<Blogs> blogses = new HashSet<Blogs>(0);

	public Account() {
	}

	public Account(String username, String password, String fullname, String email, String phone, String address, boolean status) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.status = status;
	}

	public Account(String username, String password, String fullname, String email, String phone, String address,boolean status,
			Set<Booking> bookings, Set<Role> roles, Set<Blogs> blogses) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.status = status;
		this.bookings = bookings;
		this.roles = roles;
		this.blogses = blogses;
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
	
	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "username", nullable = false)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "fullname", nullable = false)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address", nullable = false, length = 65535)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	    name = "account_role",
	    joinColumns = @JoinColumn(name = "account_id", nullable = false, insertable = true, updatable = true),
	    inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false, insertable = true, updatable = true)
	)
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Blogs> getBlogses() {
		return this.blogses;
	}

	public void setBlogses(Set<Blogs> blogses) {
		this.blogses = blogses;
	}

}
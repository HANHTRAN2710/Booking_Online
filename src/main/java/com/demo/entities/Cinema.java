package com.demo.entities;
// Generated Mar 4, 2024, 1:08:42 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * Cinema generated by hbm2java
 */
@Entity
@Table(name = "cinema")
public class Cinema implements java.io.Serializable {

	private Integer id;
	private City city;
	private String name;
	private String address;
	private String photo;
	private Set<Hall> halls = new HashSet<Hall>(0);
	private Set<Shows> showses = new HashSet<Shows>(0);

	public Cinema() {
	}

	public Cinema(City city, String name, String address, String photo) {
		this.city = city;
		this.name = name;
		this.address = address;
		this.photo = photo;
	}

	public Cinema(City city, String name, String address, String photo, Set<Hall> halls, Set<Shows> showses) {
		this.city = city;
		this.name = name;
		this.address = address;
		this.photo = photo;
		this.halls = halls;
		this.showses = showses;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false)
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", nullable = false, length = 65535)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "photo", nullable = false)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<Hall> getHalls() {
		return this.halls;
	}

	public void setHalls(Set<Hall> halls) {
		this.halls = halls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<Shows> getShowses() {
		return this.showses;
	}

	public void setShowses(Set<Shows> showses) {
		this.showses = showses;
	}

}

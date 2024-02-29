package com.demo.entities;
// Generated Feb 26, 2024, 2:16:25 PM by Hibernate Tools 4.3.6.Final

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
	private Set<Hall> halls = new HashSet<Hall>(0);

	public Cinema() {
	}

	public Cinema(City city, String name, String address) {
		this.city = city;
		this.name = name;
		this.address = address;
	}

	public Cinema(City city, String name, String address, Set<Hall> halls) {
		this.city = city;
		this.name = name;
		this.address = address;
		this.halls = halls;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<Hall> getHalls() {
		return this.halls;
	}

	public void setHalls(Set<Hall> halls) {
		this.halls = halls;
	}

}

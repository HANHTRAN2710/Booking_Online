package com.demo.entities;
// Generated Mar 8, 2024, 12:54:43 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

/**
 * Blogs generated by hbm2java
 */
@Entity
@Table(name = "blogs")
public class Blogs implements java.io.Serializable {

	private Integer id;
	private Account account;
	private String title;
	private String contents;
	private String photo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated;
	private boolean status;

	public Blogs() {
	}

	public Blogs(Account account, String title, String contents, String photo, Date created, boolean status) {
		this.account = account;
		this.title = title;
		this.contents = contents;
		this.photo = photo;
		this.created = created;
		this.status = status;
	}

	public Blogs(Account account, String title, String contents, String photo, Date created, Date updated,
			boolean status) {
		this.account = account;
		this.title = title;
		this.contents = contents;
		this.photo = photo;
		this.created = created;
		this.updated = updated;
		this.status = status;
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
	@JoinColumn(name = "account_id", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "contents", nullable = false, length = 65535)
	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Column(name = "photo", nullable = false)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updated", length = 10)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

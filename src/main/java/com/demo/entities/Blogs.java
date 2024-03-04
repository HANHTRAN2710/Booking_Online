package com.demo.entities;
// Generated Mar 4, 2024, 1:08:42 PM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.*;
/**
 * Blogs generated by hbm2java
 */
@Entity
@Table(name = "blogs")
public class Blogs implements java.io.Serializable {

	private BlogsId id;
	private Account account;

	public Blogs() {
	}

	public Blogs(BlogsId id, Account account) {
		this.id = id;
		this.account = account;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "title", column = @Column(name = "title", nullable = false)),
			@AttributeOverride(name = "contents", column = @Column(name = "contents", nullable = false, length = 65535)),
			@AttributeOverride(name = "photo", column = @Column(name = "photo", nullable = false)),
			@AttributeOverride(name = "accountId", column = @Column(name = "account_id", nullable = false)),
			@AttributeOverride(name = "created", column = @Column(name = "created", nullable = false, length = 10)),
			@AttributeOverride(name = "updated", column = @Column(name = "updated", length = 10)),
			@AttributeOverride(name = "status", column = @Column(name = "status", nullable = false)) })
	public BlogsId getId() {
		return this.id;
	}

	public void setId(BlogsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", nullable = false, insertable = false, updatable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}

package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	
	public User() {
		
	}

	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}

	public Long getIdLong() {
		return id;
	}

	public void setIdLong(Long idLong) {
		this.id = idLong;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

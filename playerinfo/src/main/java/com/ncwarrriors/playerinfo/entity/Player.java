package com.ncwarrriors.playerinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="team")
	private String team;
	
	@Column(name="position")
	private String position;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phone_number;
	
	public Player() {
		
	}
	
	public Player(String first_name, String last_name, String team, String position, String email,
			String phone_number) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.team = team;
		this.position = position;
		this.email = email;
		this.phone_number = phone_number;
	}

	public Player(int id, String first_name, String last_name, String team, String position, String email,
			String phone_number) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.team = team;
		this.position = position;
		this.email = email;
		this.phone_number = phone_number;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
}

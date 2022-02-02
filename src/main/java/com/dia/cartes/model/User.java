package com.dia.cartes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="first_Name")
	private String firstName;
	@Column(name="last_Name")
	private String lasteName;
	@Column(name="adress")
	private String adress;
	@Column(name="calphone")
	private int calphone;
	@Column(name="countries")
	private String countries;
	@Column(name="pwd")
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int idUser, String firstName, String lasteName, String adress, int calphone, String countries,
			String password) {
		super();
		this.id = idUser;
		this.firstName = firstName;
		this.lasteName = lasteName;
		this.adress = adress;
		this.calphone = calphone;
		this.countries = countries;
		this.password = password;
	}
	public int getIdUser() {
		return id;
	}
	public void setIdUser(int idUser) {
		this.id = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasteName() {
		return lasteName;
	}
	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCalphone() {
		return calphone;
	}
	public void setCalphone(int calphone) {
		this.calphone = calphone;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

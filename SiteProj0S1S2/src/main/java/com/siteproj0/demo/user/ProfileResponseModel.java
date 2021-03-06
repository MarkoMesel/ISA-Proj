package com.siteproj0.demo.user;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import validations.FieldMatch;
import validations.ValidPassword;
import javax.validation.constraints.NotEmpty;


public class ProfileResponseModel {	

	public ProfileResponseModel(int id, String firstName, String lastName, String country, String city, String street,
			String phone, String jmbg, String email, boolean isVerified, String role, boolean firstLogin) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.city = city;
		this.street = street;
		this.phone = phone;
		this.jmbg = jmbg;
		this.email = email;
		this.verified = isVerified;
		this.role = role;
		this.firstLogin = firstLogin;
	}
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String country; 
	
	private String city;
	
	private String street;
	
	private String phone;	

	private String jmbg;	

	private String email;
	
	private boolean verified;
	
	private String role;
	
	private boolean firstLogin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone= phone;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean isVerified) {
		this.verified = isVerified;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isFirstLogin() {
		return firstLogin;
	}
	public void setFirstLogin(boolean firstLogin) {
		this.firstLogin = firstLogin;
	}
	
}

package com.ifli.insurance.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="address")
	private String address;
	

	@Column(name="birthdate")
	private String DOB;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
   
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String firstname, String lastname, String address, String dOB, String mobile, String emailid,
			String username, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.DOB = dOB;
		this.mobile = mobile;
		this.emailid = emailid;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", DOB=" + DOB + ", mobile=" + mobile + ", emailid=" + emailid + ", username=" + username
				+ ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DOB, address, emailid, firstname, id, lastname, mobile, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(DOB, other.DOB) && Objects.equals(address, other.address)
				&& Objects.equals(emailid, other.emailid) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	
	
	
	

}

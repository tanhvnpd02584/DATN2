package com.poly.musicshop.model;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long userID;

	@Size(min = 2)
	@Column(name = "User_Name")
	private String userName;

	@Size(min = 8)
	@Column(name = "Password")
	private String password;

	@Size(min = 2)
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Bob")
	private Date Bob;
	
	@Column(name = "Gender")
	private boolean gender; 

	@Size(min = 9)
	@Column(name = "Tel")
	private String tel;

	@Size(min = 2)
	@Column(name = "Email")
	private String email;
	
	@Size(min = 2)
	@Column(name = "address")
	private String address;

	@OneToOne(targetEntity = Role.class)
	private Role roleUser;
	
	
	

	public User(Long userID, @Size(min = 2) String userName, @Size(min = 8) String password, @Size(min = 2) String name,
			Date bob, boolean gender, @Size(min = 9) String tel, @Size(min = 2) String email,
			@Size(min = 2) String address, Role roleUser) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		Name = name;
		Bob = bob;
		this.gender = gender;
		this.tel = tel;
		this.email = email;
		this.address = address;
		this.roleUser = roleUser;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getBob() {
		return Bob;
	}

	public void setBob(Date bob) {
		Bob = bob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(Role roleUser) {
		this.roleUser = roleUser;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
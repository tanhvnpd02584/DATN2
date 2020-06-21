package com.poly.musicshop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;




@Entity
@Table(name = "orders")
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(name = "date")
	private Date Dateorder;
	

	@Size(min = 9)
	@Column(name = "name")
	private String Name;
	
	@Size(min = 9)
	@Column(name = "tel")
	private String Tel;	
	
	@Size(min = 2)
	@Column(name = "address")
	private String Address;
	
	@Size(min = 2)
	@Column(name = "note")
	private String Note;

	public Order() {
		
	}
	
    @OneToOne(targetEntity = Status.class)
    private Status statusPurchase;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateorder() {
		return Dateorder;
	}


	public void setDateorder(Date dateorder) {
		Dateorder = dateorder;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getTel() {
		return Tel;
	}


	public void setTel(String tel) {
		Tel = tel;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getNote() {
		return Note;
	}


	public void setNote(String note) {
		Note = note;
	}


	public Status getStatusPurchase() {
		return statusPurchase;
	}


	public void setStatusPurchase(Status statusPurchase) {
		this.statusPurchase = statusPurchase;
	}


	public Order(Long id, Date dateorder, @Size(min = 9) String name, @Size(min = 9) String tel,
			@Size(min = 2) String address, @Size(min = 2) String note, Status statusPurchase) {
		super();
		this.id = id;
		Dateorder = dateorder;
		Name = name;
		Tel = tel;
		Address = address;
		Note = note;
		this.statusPurchase = statusPurchase;
	}



	
    
	
}

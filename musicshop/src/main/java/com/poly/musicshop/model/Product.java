package com.poly.musicshop.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String PostName;

	private String Description;

	private Double Price;

	private Integer Quantity;

	private String Address;

	@OneToOne(targetEntity = Category.class)
	private Category category;
	
	@OneToOne(targetEntity = Brand.class)
	private Brand brand;

	public Product() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostName() {
		return PostName;
	}

	public void setPostName(String postName) {
		PostName = postName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Product(Long id, String postName, String description, Double price, Integer quantity, String address,
			Category category, Brand brand) {
		super();
		this.id = id;
		PostName = postName;
		Description = description;
		Price = price;
		Quantity = quantity;
		Address = address;
		this.category = category;
		this.brand = brand;
	}



}
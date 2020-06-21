package com.poly.musicshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Changes")
public class Change {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ProductName;

	private String Description;

	private Double Price;

	private Integer Quantity;

	private String Address;

	@OneToOne(targetEntity = Category.class)
	private Category category;
	
	@OneToOne(targetEntity = Brand.class)
	private Brand brand;
	
	@OneToOne(targetEntity = ChangeStates.class)
	private ChangeStates changestates;
	
	@OneToOne(targetEntity = Product.class)
	private Product product;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
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

	public ChangeStates getChangestates() {
		return changestates;
	}

	public void setChangestates(ChangeStates changestates) {
		this.changestates = changestates;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Change(Long id, String productName, String description, Double price, Integer quantity, String address,
			Category category, Brand brand, ChangeStates changestates, Product product) {
		super();
		this.id = id;
		ProductName = productName;
		Description = description;
		Price = price;
		Quantity = quantity;
		Address = address;
		this.category = category;
		this.brand = brand;
		this.changestates = changestates;
		this.product = product;
	}


    
    
    
}

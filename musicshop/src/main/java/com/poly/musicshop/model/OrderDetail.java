package com.poly.musicshop.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "orderdetails")
public class OrderDetail {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


		@Size(min = 2)
		@Column(name = "Name")
		private String Name;
		
		private double Price;
		
		private int Quantity;
		
	 	@ManyToOne(targetEntity = Order.class)
	    private User user;

	 	@ManyToOne(targetEntity = Product.class)
	    private Product product;
	 	
	 
		public OrderDetail(Long id, @Size(min = 2) String name, double price, int quantity, User user,
				Product product) {
			super();
			this.id = id;
			Name = name;
			Price = price;
			Quantity = quantity;
			this.user = user;
			this.product = product;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public double getPrice() {
			return Price;
		}

		public void setPrice(double price) {
			Price = price;
		}

		public int getQuantity() {
			return Quantity;
		}

		public void setQuantity(int quantity) {
			Quantity = quantity;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}


	  
}

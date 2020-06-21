package com.poly.musicshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "rates")
public class Rate {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	 	@ManyToOne(targetEntity = User.class)
	    private User user;

	 	@ManyToOne(targetEntity = Product.class)
	    private Product product;
	 	

	    private Integer rateNumber;

	    
	    
	    public Rate(Long id, User user, Product product, Integer rateNumber) {
			super();
			this.id = id;
			this.user = user;
			this.product = product;
			this.rateNumber = rateNumber;
		}

		public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
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

		public Integer getRateNumber() {
			return rateNumber;
		}

		public void setRateNumber(Integer rateNumber) {
			this.rateNumber = rateNumber;
		}

	  
	
}

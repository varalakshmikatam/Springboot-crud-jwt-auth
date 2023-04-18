package com.bezkoder.spring.security.jwt.productmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "products")

public class Product {
	
		
		@Id
		private long id;
		
		@Column(name = "product_name")
		private String productName;

		
		@Column(name = "price")
		private Double price;
		
		@Column(name = "quality")
		private String qality;
		
		@Column(name = "quantity")
		private Integer quantity;
		
		private Double total;

		public Product() {
			super();
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getQality() {
			return qality;
		}

		public void setQality(String qality) {
			this.qality = qality;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}


}

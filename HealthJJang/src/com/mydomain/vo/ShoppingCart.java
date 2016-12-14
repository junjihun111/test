package com.mydomain.vo;

import java.io.Serializable;
import java.util.List;

public class ShoppingCart implements Serializable {
	private int productNo;
	
	private String productName;
	private String password;
	private String name;
	private List<Product> product;

	public ShoppingCart() {
		super();
	}
	public ShoppingCart(int productNo, String productName, String password, String name) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.password = password;
		this.name = name;
	}
	public ShoppingCart(int productNo, String productName, String password, String name, List<Product> product) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.password = password;
		this.name = name;
		this.product = product;
	}
	@Override
	public String toString() {
		return "ShoppingCart [productNo=" + productNo + ", productName=" + productName + ", password=" + password
				+ ", name=" + name + ", product=" + product + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingCart other = (ShoppingCart) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productNo != other.productNo)
			return false;
		return true;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	}

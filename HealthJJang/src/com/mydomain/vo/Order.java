package com.mydomain.vo;

import java.util.List;

public class Order {
	private String orderationNo;
	private String ordererName;
	private int ordererCount;
	private String password;
	private List<Orderation> orderation;
	
	public Order() {
		super();
	}
	public Order(String orderationNo, String ordererName, int ordererCount, String password) {
		super();
		this.orderationNo = orderationNo;
		this.ordererName = ordererName;
		this.ordererCount = ordererCount;
		this.password = password;
	}
	public Order(String orderationNo, String ordererName, int ordererCount, String password,
			List<Orderation> orderation) {
		super();
		this.orderationNo = orderationNo;
		this.ordererName = ordererName;
		this.ordererCount = ordererCount;
		this.password = password;
		this.orderation = orderation;
	}
	@Override
	public String toString() {
		return "Order [orderationNo=" + orderationNo + ", ordererName=" + ordererName + ", ordererCount=" + ordererCount
				+ ", password=" + password + ", orderation=" + orderation + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderation == null) ? 0 : orderation.hashCode());
		result = prime * result + ((orderationNo == null) ? 0 : orderationNo.hashCode());
		result = prime * result + ordererCount;
		result = prime * result + ((ordererName == null) ? 0 : ordererName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Order other = (Order) obj;
		if (orderation == null) {
			if (other.orderation != null)
				return false;
		} else if (!orderation.equals(other.orderation))
			return false;
		if (orderationNo == null) {
			if (other.orderationNo != null)
				return false;
		} else if (!orderationNo.equals(other.orderationNo))
			return false;
		if (ordererCount != other.ordererCount)
			return false;
		if (ordererName == null) {
			if (other.ordererName != null)
				return false;
		} else if (!ordererName.equals(other.ordererName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	public String getOrderationNo() {
		return orderationNo;
	}
	public void setOrderationNo(String orderationNo) {
		this.orderationNo = orderationNo;
	}
	public String getOrdererName() {
		return ordererName;
	}
	public void setOrdererName(String ordererName) {
		this.ordererName = ordererName;
	}
	public int getOrdererCount() {
		return ordererCount;
	}
	public void setOrdererCount(int ordererCount) {
		this.ordererCount = ordererCount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Orderation> getOrderation() {
		return orderation;
	}
	public void setOrderation(List<Orderation> orderation) {
		this.orderation = orderation;
	}
	
	}

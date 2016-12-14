package com.mydomain.vo;

public class Orderation {
	private String orderationNo;
	private String productName;
	private String buyerName;
	private String phone1;
	private String phone2;
	private String phone3;
	private String orderationAddress;
	private String postalNumber;
	private String code;
	private int productAmount;
	private int orderationPrice;
	private String imageName;
	
	
	public Orderation(String orderationNo, String phone1, String phone2, String phone3, String orderationAddress,
			String postalNumber) {
		super();
		this.orderationNo = orderationNo;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.orderationAddress = orderationAddress;
		this.postalNumber = postalNumber;
	}
	public Orderation() {
		super();
	}
	public Orderation(String orderationNo, String productName, String buyerName, String phone1, String phone2,
			String phone3, String orderationAddress, String postalNumber, String code, int productAmount,
			int orderationPrice, String imageName) {
		super();
		this.orderationNo = orderationNo;
		this.productName = productName;
		this.buyerName = buyerName;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.orderationAddress = orderationAddress;
		this.postalNumber = postalNumber;
		this.code = code;
		this.productAmount = productAmount;
		this.orderationPrice = orderationPrice;
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "Orderation [orderationNo=" + orderationNo + ", productName=" + productName + ", buyerName=" + buyerName
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3=" + phone3 + ", orderationAddress="
				+ orderationAddress + ", postalNumber=" + postalNumber + ", code=" + code + ", productAmount="
				+ productAmount + ", orderationPrice=" + orderationPrice + ", imageName=" + imageName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyerName == null) ? 0 : buyerName.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((imageName == null) ? 0 : imageName.hashCode());
		result = prime * result + ((orderationAddress == null) ? 0 : orderationAddress.hashCode());
		result = prime * result + ((orderationNo == null) ? 0 : orderationNo.hashCode());
		result = prime * result + orderationPrice;
		result = prime * result + ((phone1 == null) ? 0 : phone1.hashCode());
		result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
		result = prime * result + ((phone3 == null) ? 0 : phone3.hashCode());
		result = prime * result + ((postalNumber == null) ? 0 : postalNumber.hashCode());
		result = prime * result + productAmount;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
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
		Orderation other = (Orderation) obj;
		if (buyerName == null) {
			if (other.buyerName != null)
				return false;
		} else if (!buyerName.equals(other.buyerName))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (imageName == null) {
			if (other.imageName != null)
				return false;
		} else if (!imageName.equals(other.imageName))
			return false;
		if (orderationAddress == null) {
			if (other.orderationAddress != null)
				return false;
		} else if (!orderationAddress.equals(other.orderationAddress))
			return false;
		if (orderationNo == null) {
			if (other.orderationNo != null)
				return false;
		} else if (!orderationNo.equals(other.orderationNo))
			return false;
		if (orderationPrice != other.orderationPrice)
			return false;
		if (phone1 == null) {
			if (other.phone1 != null)
				return false;
		} else if (!phone1.equals(other.phone1))
			return false;
		if (phone2 == null) {
			if (other.phone2 != null)
				return false;
		} else if (!phone2.equals(other.phone2))
			return false;
		if (phone3 == null) {
			if (other.phone3 != null)
				return false;
		} else if (!phone3.equals(other.phone3))
			return false;
		if (postalNumber == null) {
			if (other.postalNumber != null)
				return false;
		} else if (!postalNumber.equals(other.postalNumber))
			return false;
		if (productAmount != other.productAmount)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}
	public String getOrderationNo() {
		return orderationNo;
	}
	public void setOrderationNo(String orderationNo) {
		this.orderationNo = orderationNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getOrderationAddress() {
		return orderationAddress;
	}
	public void setOrderationAddress(String orderationAddress) {
		this.orderationAddress = orderationAddress;
	}
	public String getPostalNumber() {
		return postalNumber;
	}
	public void setPostalNumber(String postalNumber) {
		this.postalNumber = postalNumber;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	public int getOrderationPrice() {
		return orderationPrice;
	}
	public void setOrderationPrice(int orderationPrice) {
		this.orderationPrice = orderationPrice;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
}
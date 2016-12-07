package com.mydomain.vo;

import java.io.Serializable;
import java.util.Arrays;

public class Color implements Serializable {
 private String colorName;
 private int productNo;
 private String productSize;
 private String productFrame;

 public Color(String colorName, int productNo, String productFrame) {
	super();
	this.colorName = colorName;
	this.productNo = productNo;
	this.productFrame = productFrame;
}
public Color(int productNo, String productFrame) {
	super();
	this.productNo = productNo;
	this.productFrame = productFrame;
}
public String getColorName() {
	return colorName;
}
public void setColorName(String colorName) {
	this.colorName = colorName;
}
public int getProductNo() {
	return productNo;
}
public void setProductNo(int productNo) {
	this.productNo = productNo;
}
public String getProductSize() {
	return productSize;
}
public void setProductSize(String productSize) {
	this.productSize = productSize;
}
public String getProductFrame() {
	return productFrame;
}
public void setProductFrame(String productFrame) {
	this.productFrame = productFrame;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((colorName == null) ? 0 : colorName.hashCode());
	result = prime * result + ((productFrame == null) ? 0 : productFrame.hashCode());
	result = prime * result + productNo;
	result = prime * result + ((productSize == null) ? 0 : productSize.hashCode());
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
	Color other = (Color) obj;
	if (colorName == null) {
		if (other.colorName != null)
			return false;
	} else if (!colorName.equals(other.colorName))
		return false;
	if (productFrame == null) {
		if (other.productFrame != null)
			return false;
	} else if (!productFrame.equals(other.productFrame))
		return false;
	if (productNo != other.productNo)
		return false;
	if (productSize == null) {
		if (other.productSize != null)
			return false;
	} else if (!productSize.equals(other.productSize))
		return false;
	return true;
}
@Override
public String toString() {
	return "Color [colorName=" + colorName + ", productNo=" + productNo + ", productSize=" + productSize
			+ ", productFrame=" + productFrame + "]";
}
public Color(String colorName, int productNo, String productSize, String productFrame) {
	super();
	this.colorName = colorName;
	this.productNo = productNo;
	this.productSize = productSize;
	this.productFrame = productFrame;
}
public Color() {
	super();
}
 
}

package com.mydomain.vo;

import java.io.Serializable;

public class TColor implements Serializable {
 private String colorName;

public TColor() {
	super();
}

public TColor(String colorName) {
	super();
	this.colorName = colorName;
}

@Override
public String toString() {
	return "TColor [colorName=" + colorName + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((colorName == null) ? 0 : colorName.hashCode());
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
	TColor other = (TColor) obj;
	if (colorName == null) {
		if (other.colorName != null)
			return false;
	} else if (!colorName.equals(other.colorName))
		return false;
	return true;
}

public String getColorName() {
	return colorName;
}

public void setColorName(String colorName) {
	this.colorName = colorName;
}
}

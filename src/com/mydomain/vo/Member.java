package com.mydomain.vo;

import java.io.Serializable;

public class Member implements Serializable {
	private int memberNo;
	private String memberName;
	private String memberPhoneEnd;
	
	
	public Member(int memberNo, String memberPhoneEnd) {
		super();
		this.memberNo = memberNo;
		this.memberPhoneEnd = memberPhoneEnd;
	}
	public Member() {
		super();
	}
	public Member(int memberNo, String memberName, String memberPhoneEnd) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneEnd = memberPhoneEnd;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", memberPhoneEnd=" + memberPhoneEnd
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + memberNo;
		result = prime * result + ((memberPhoneEnd == null) ? 0 : memberPhoneEnd.hashCode());
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
		Member other = (Member) obj;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (memberNo != other.memberNo)
			return false;
		if (memberPhoneEnd == null) {
			if (other.memberPhoneEnd != null)
				return false;
		} else if (!memberPhoneEnd.equals(other.memberPhoneEnd))
			return false;
		return true;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhoneEnd() {
		return memberPhoneEnd;
	}
	public void setMemberPhoneEnd(String memberPhoneEnd) {
		this.memberPhoneEnd = memberPhoneEnd;
	}
	
}

package com.mydomain.vo;

import java.io.Serializable;

public class Member implements Serializable {
	private int memberNo;
	private String memberPhoneEnd;
	
	public Member() {
		super();
	}
	public Member(int memberNo, String memberPhoneEnd) {
		super();
		this.memberNo = memberNo;
		this.memberPhoneEnd = memberPhoneEnd;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberPhoneEnd=" + memberPhoneEnd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
	public String getMemberPhoneEnd() {
		return memberPhoneEnd;
	}
	public void setMemberPhoneEnd(String memberPhoneEnd) {
		this.memberPhoneEnd = memberPhoneEnd;
	}
}

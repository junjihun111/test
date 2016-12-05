package com.mydomain.vo;

import java.io.Serializable;

public class CodePage implements Serializable {
	private String frame;
	private int page;
	
	public CodePage() {
		super();
	}
	public CodePage(String frame, int page) {
		super();
		this.frame = frame;
		this.page = page;
	}
	@Override
	public String toString() {
		return "CodePage [frame=" + frame + ", page=" + page + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frame == null) ? 0 : frame.hashCode());
		result = prime * result + page;
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
		CodePage other = (CodePage) obj;
		if (frame == null) {
			if (other.frame != null)
				return false;
		} else if (!frame.equals(other.frame))
			return false;
		if (page != other.page)
			return false;
		return true;
	}
	public String getFrame() {
		return frame;
	}
	public void setFrame(String frame) {
		this.frame = frame;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}

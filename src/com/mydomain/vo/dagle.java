package com.mydomain.vo;

import java.io.Serializable;
import java.util.Date;

public class dagle implements Serializable{
	private int board_no;
	private String content;
	private Date board_date;
	private int board_count;
	private String board_writer;
	private String board_password;
	
	
	
	public int getBoard_no() {
		return board_no;
	}



	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Date getBoard_date() {
		return board_date;
	}



	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}



	public int getBoard_count() {
		return board_count;
	}



	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}



	public String getBoard_writer() {
		return board_writer;
	}



	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}



	public String getBoard_password() {
		return board_password;
	}



	public void setBoard_password(String board_password) {
		this.board_password = board_password;
	}



	public dagle(int board_no, String content, Date board_date, int board_count, String board_writer,
			String board_password) {
		super();
		this.board_no = board_no;
		this.content = content;
		this.board_date = board_date;
		this.board_count = board_count;
		this.board_writer = board_writer;
		this.board_password = board_password;
	}



	@Override
	public String toString() {
		return "dagle [board_no=" + board_no + ", content=" + content + ", board_date=" + board_date + ", board_count="
				+ board_count + ", board_writer=" + board_writer + ", board_password=" + board_password + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + board_count;
		result = prime * result + ((board_date == null) ? 0 : board_date.hashCode());
		result = prime * result + board_no;
		result = prime * result + ((board_password == null) ? 0 : board_password.hashCode());
		result = prime * result + ((board_writer == null) ? 0 : board_writer.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
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
		dagle other = (dagle) obj;
		if (board_count != other.board_count)
			return false;
		if (board_date == null) {
			if (other.board_date != null)
				return false;
		} else if (!board_date.equals(other.board_date))
			return false;
		if (board_no != other.board_no)
			return false;
		if (board_password == null) {
			if (other.board_password != null)
				return false;
		} else if (!board_password.equals(other.board_password))
			return false;
		if (board_writer == null) {
			if (other.board_writer != null)
				return false;
		} else if (!board_writer.equals(other.board_writer))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}



	public dagle(){}
	
}

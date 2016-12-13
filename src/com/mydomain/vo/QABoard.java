package com.mydomain.vo;

import java.io.Serializable;
import java.util.Date;

public class QABoard implements Serializable{
	private int no;
	private String title;
	private String contents;
	private String writer;
	private Date wdate;
	private int grp;
	private int seq;
	private int lvl;
	
	

	



	public QABoard(int no, String title, String contents, String writer, Date wdate, int grp, int seq, int lvl) {
		super();
		this.no = no;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.wdate = wdate;
		this.grp = grp;
		this.seq = seq;
		this.lvl = lvl;
	}







	@Override
	public String toString() {
		return "QABoard [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", wdate="
				+ wdate + ", grp=" + grp + ", seq=" + seq + ", lvl=" + lvl + "]";
	}







	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + grp;
		result = prime * result + lvl;
		result = prime * result + no;
		result = prime * result + seq;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((wdate == null) ? 0 : wdate.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
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
		QABoard other = (QABoard) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (grp != other.grp)
			return false;
		if (lvl != other.lvl)
			return false;
		if (no != other.no)
			return false;
		if (seq != other.seq)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (wdate == null) {
			if (other.wdate != null)
				return false;
		} else if (!wdate.equals(other.wdate))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}







	public int getNo() {
		return no;
	}







	public void setNo(int no) {
		this.no = no;
	}







	public String getTitle() {
		return title;
	}







	public void setTitle(String title) {
		this.title = title;
	}







	public String getContents() {
		return contents;
	}







	public void setContents(String contents) {
		this.contents = contents;
	}







	public String getWriter() {
		return writer;
	}







	public void setWriter(String writer) {
		this.writer = writer;
	}







	public Date getWdate() {
		return wdate;
	}







	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}







	public int getGrp() {
		return grp;
	}







	public void setGrp(int grp) {
		this.grp = grp;
	}







	public int getSeq() {
		return seq;
	}







	public void setSeq(int seq) {
		this.seq = seq;
	}







	public int getLvl() {
		return lvl;
	}







	public void setLvl(int lvl) {
		this.lvl = lvl;
	}







	public QABoard() {
	}
}

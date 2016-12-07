package com.mydomain.vo;

import java.util.Date;

public class QABoard {
	private int QABoardNo;
	private String QABoardName;
	private int QABoardIdentificationnumber;
	private int QABoardOrder;
	private int QABoardClass;
	private String QABoardContent;
	private Date QABoardDate;
	private String QABoardWriter;

	public int getQABoardNo() {
		return QABoardNo;
	}

	public void setQABoardNo(int qABoardNo) {
		QABoardNo = qABoardNo;
	}

	public String getQABoardName() {
		return QABoardName;
	}

	public void setQABoardName(String qABoardName) {
		QABoardName = qABoardName;
	}

	public int getQABoardIdentificationnumber() {
		return QABoardIdentificationnumber;
	}

	public void setQABoardIdentificationnumber(int qABoardIdentificationnumber) {
		QABoardIdentificationnumber = qABoardIdentificationnumber;
	}

	public int getQABoardOrder() {
		return QABoardOrder;
	}

	public void setQABoardOrder(int qABoardOrder) {
		QABoardOrder = qABoardOrder;
	}

	public int getQABoardClass() {
		return QABoardClass;
	}

	public void setQABoardClass(int qABoardClass) {
		QABoardClass = qABoardClass;
	}

	public String getQABoardContent() {
		return QABoardContent;
	}

	public void setQABoardContent(String qABoardContent) {
		QABoardContent = qABoardContent;
	}

	public Date getQABoardDate() {
		return QABoardDate;
	}

	public void setQABoardDate(Date qABoardDate) {
		QABoardDate = qABoardDate;
	}

	public String getQABoardWriter() {
		return QABoardWriter;
	}

	public void setQABoardWriter(String qABoardWriter) {
		QABoardWriter = qABoardWriter;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + QABoardClass;
		result = prime * result + ((QABoardContent == null) ? 0 : QABoardContent.hashCode());
		result = prime * result + ((QABoardDate == null) ? 0 : QABoardDate.hashCode());
		result = prime * result + QABoardIdentificationnumber;
		result = prime * result + ((QABoardName == null) ? 0 : QABoardName.hashCode());
		result = prime * result + QABoardNo;
		result = prime * result + QABoardOrder;
		result = prime * result + ((QABoardWriter == null) ? 0 : QABoardWriter.hashCode());
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
		if (QABoardClass != other.QABoardClass)
			return false;
		if (QABoardContent == null) {
			if (other.QABoardContent != null)
				return false;
		} else if (!QABoardContent.equals(other.QABoardContent))
			return false;
		if (QABoardDate == null) {
			if (other.QABoardDate != null)
				return false;
		} else if (!QABoardDate.equals(other.QABoardDate))
			return false;
		if (QABoardIdentificationnumber != other.QABoardIdentificationnumber)
			return false;
		if (QABoardName == null) {
			if (other.QABoardName != null)
				return false;
		} else if (!QABoardName.equals(other.QABoardName))
			return false;
		if (QABoardNo != other.QABoardNo)
			return false;
		if (QABoardOrder != other.QABoardOrder)
			return false;
		if (QABoardWriter == null) {
			if (other.QABoardWriter != null)
				return false;
		} else if (!QABoardWriter.equals(other.QABoardWriter))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "QABoard [QABoardNo=" + QABoardNo + ", QABoardName=" + QABoardName + ", QABoardIdentificationnumber="
				+ QABoardIdentificationnumber + ", QABoardOrder=" + QABoardOrder + ", QABoardClass=" + QABoardClass
				+ ", QABoardContent=" + QABoardContent + ", QABoardDate=" + QABoardDate + ", QABoardWriter="
				+ QABoardWriter + "]";
	}
	
	

	public QABoard(int qABoardNo, String qABoardName, int qABoardIdentificationnumber, int qABoardOrder,
			int qABoardClass, String qABoardContent, Date qABoardDate, String qABoardWriter) {
		super();
		QABoardNo = qABoardNo;
		QABoardName = qABoardName;
		QABoardIdentificationnumber = qABoardIdentificationnumber;
		QABoardOrder = qABoardOrder;
		QABoardClass = qABoardClass;
		QABoardContent = qABoardContent;
		QABoardDate = qABoardDate;
		QABoardWriter = qABoardWriter;
	}

	public QABoard() {
	}
}

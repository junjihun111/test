package com.mydomain.vo;

public class CodeTable {
	private String CODE;
	private String CODEVALUE;
	private String CODEOPTION;
	private String EXPLAIN;
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getCODEVALUE() {
		return CODEVALUE;
	}
	public void setCODEVALUE(String cODEVALUE) {
		CODEVALUE = cODEVALUE;
	}
	public String getCODEOPTION() {
		return CODEOPTION;
	}
	public void setCODEOPTION(String cODEOPTION) {
		CODEOPTION = cODEOPTION;
	}
	public String getEXPLAIN() {
		return EXPLAIN;
	}
	public void setEXPLAIN(String eXPLAIN) {
		EXPLAIN = eXPLAIN;
	}
	
	public CodeTable(){}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CODE == null) ? 0 : CODE.hashCode());
		result = prime * result + ((CODEOPTION == null) ? 0 : CODEOPTION.hashCode());
		result = prime * result + ((CODEVALUE == null) ? 0 : CODEVALUE.hashCode());
		result = prime * result + ((EXPLAIN == null) ? 0 : EXPLAIN.hashCode());
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
		CodeTable other = (CodeTable) obj;
		if (CODE == null) {
			if (other.CODE != null)
				return false;
		} else if (!CODE.equals(other.CODE))
			return false;
		if (CODEOPTION == null) {
			if (other.CODEOPTION != null)
				return false;
		} else if (!CODEOPTION.equals(other.CODEOPTION))
			return false;
		if (CODEVALUE == null) {
			if (other.CODEVALUE != null)
				return false;
		} else if (!CODEVALUE.equals(other.CODEVALUE))
			return false;
		if (EXPLAIN == null) {
			if (other.EXPLAIN != null)
				return false;
		} else if (!EXPLAIN.equals(other.EXPLAIN))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CodeTable [CODE=" + CODE + ", CODEVALUE=" + CODEVALUE + ", CODEOPTION=" + CODEOPTION + ", EXPLAIN="
				+ EXPLAIN + "]";
	}
	public CodeTable(String cODE, String cODEVALUE, String cODEOPTION, String eXPLAIN) {
		super();
		CODE = cODE;
		CODEVALUE = cODEVALUE;
		CODEOPTION = cODEOPTION;
		EXPLAIN = eXPLAIN;
	}
	
	
}

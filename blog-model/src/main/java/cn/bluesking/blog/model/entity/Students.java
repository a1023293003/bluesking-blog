package cn.bluesking.blog.model.entity;


public class Students {

	private String SID = null;

	private String SNAME = null;

	private String SEX = null;

	private String CARDNUMBER = null;

	private String PWD = null;

	private String DEPARTMENT = null;

	private String PHONE = null;

	public void setSID(String SID) {
		this.SID = SID;
	}

	public String getSID() {
		return this.SID;
	}

	public void setSNAME(String SNAME) {
		this.SNAME = SNAME;
	}

	public String getSNAME() {
		return this.SNAME;
	}

	public void setSEX(String SEX) {
		this.SEX = SEX;
	}

	public String getSEX() {
		return this.SEX;
	}

	public void setCARDNUMBER(String CARDNUMBER) {
		this.CARDNUMBER = CARDNUMBER;
	}

	public String getCARDNUMBER() {
		return this.CARDNUMBER;
	}

	public void setPWD(String PWD) {
		this.PWD = PWD;
	}

	public String getPWD() {
		return this.PWD;
	}

	public void setDEPARTMENT(String DEPARTMENT) {
		this.DEPARTMENT = DEPARTMENT;
	}

	public String getDEPARTMENT() {
		return this.DEPARTMENT;
	}

	public void setPHONE(String PHONE) {
		this.PHONE = PHONE;
	}

	public String getPHONE() {
		return this.PHONE;
	}

	@Override
	public String toString() {
		return "Students [SID=" + SID + ", SNAME=" + SNAME + ", SEX=" + SEX + ", CARDNUMBER=" + CARDNUMBER + ", PWD="
				+ PWD + ", DEPARTMENT=" + DEPARTMENT + ", PHONE=" + PHONE + "]";
	}

}
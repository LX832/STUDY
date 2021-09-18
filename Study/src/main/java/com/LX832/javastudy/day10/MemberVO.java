package com.LX832.javastudy.day10;

import javax.xml.crypto.Data;

public class MemberVO {
	private String id;
	private String pwd;
	private String iname;
	private String phone;
	private String addr;
	private Data regDate;
	private int grade;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Data getRegDate() {
		return regDate;
	}
	public void setRegDate(Data regDate) {
		this.regDate = regDate;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int setGrade) {
		this.grade = grade;
		
	}

	
	

}

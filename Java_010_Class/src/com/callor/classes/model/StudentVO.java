package com.callor.classes.model;

public class StudentVO {

	private String num;
	private String name;
	private Integer grade;
	
	private String addr;
	private String tel;
	
	// 모든 변수는 private 작성
	// Alt + Shift + S : getter setter 자동완성
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
	
	
}

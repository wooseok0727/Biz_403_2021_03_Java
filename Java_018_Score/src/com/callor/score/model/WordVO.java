package com.callor.score.model;

public class WordVO {

	private Integer count;
	private String english;
	private String korea;
	
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorea() {
		return korea;
	}
	public void setKorea(String korea) {
		this.korea = korea;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "[count=" + count + ", english=" + english + ", korea=" + korea + "]";
	}
	
	
}

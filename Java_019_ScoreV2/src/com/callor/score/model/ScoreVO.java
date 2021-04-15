package com.callor.score.model;

public class ScoreVO {

	private String num;
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		Integer total = this.kor + this.eng + this.math;
		return total;
	}
	public Float getAvg() {
		Float avg = (float)this.getTotal() / 3;
		return avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + this.getTotal()
				+ ", avg=" + this.getAvg() + "]";
	}
	
	
}

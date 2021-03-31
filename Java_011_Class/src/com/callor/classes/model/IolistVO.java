package com.callor.classes.model;

/* 
 * 1. 매입매출 관리 프로젝트를 시작하려고 합니다
 * 2. 매입매출 프로젝트에서 사용할 VO 클래스를 설계합니다
 * 3. 매입 : 회사에서 판매를 목적으로 물품을 구입하는 것
 * 4. 매출 : 회사에서 상품을 고객에게 판매하는 것
 * 5. 매입매출 관리를 하기 위해
 * 		"상품이름", "거래처", "매입매출구분",
 * 		"수량", "매입단가", "매출단가" 데이터가 필요합니다.
 * 6. 수량, 매입단가, 매출단가는 곱셈연산이 필요한 데이터입니다.
 * 7. 적절한 데이터 type을 선정하여 클래스를 만듦니다.
 */

/*
 * 매입매출 프로젝트
 *  마트, 편의점. 쇼핑몰 등에서 공상품을 구매하여
 *  고객에게 마진을 붙여 판매하고 이익금등을 계산하는
 *  프로젝트
 *  
 *  소매점(도매점 등으로 부터 구매하여 일반 소비자에게 판매)
 *  도매점(생산공장에서 구매하여, 소매점에 판매)
 *  
 *  기본적으로 필요한 데이터 항목
 *  객체지향 이론에서 추상화(단계) 라고 한다
 *  상품이름(pname) String type
 *  거래일자(date) 2021-03-31 String type
 *  거래처(dname) String type
 *  매입매출구분(inout) String type
 *  수량(qty) Integer type
 *  매입단가(iprice) Integer type
 *  매출단가(oprice) Integer type
 */
public class IolistVO {
	
	// 객체지향 이론(특징)에서 "정보의 은닉"하기
	private String pname;
	private String date;
	private String dname;
	private String inout;
	
	private Integer qty;
	private Integer iprice;
	private Integer oprice;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getIprice() {
		return iprice;
	}
	public void setIprice(Integer iprice) {
		this.iprice = iprice;
	}
	public Integer getOprice() {
		return oprice;
	}
	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}

}

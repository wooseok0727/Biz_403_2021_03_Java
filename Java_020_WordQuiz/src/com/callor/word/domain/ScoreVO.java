package com.callor.word.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ScoreVO {

	private Integer 포인트;
	private Integer 맞은개수;
	private Integer 틀린개수;
	
	private Integer 재도전;
	private Integer 힌트보기;
	
	public ScoreVO() {
		this(3);
	}
	
	public ScoreVO(Integer 재도전) {
		this.재도전 = 재도전;
		this.포인트 = 5;
		this.맞은개수 = 0;
		this.틀린개수 = 0;
		this.힌트보기 = 0;
	}
	
	public ScoreVO(Integer 포인트, Integer 맞은개수, Integer 틀린개수) {
		this.포인트 = 포인트;
		this.맞은개수 = 맞은개수;
		this.틀린개수 = 틀린개수;
		this.재도전 = 3;
	}
}

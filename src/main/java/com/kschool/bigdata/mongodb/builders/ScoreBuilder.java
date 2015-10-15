package com.kschool.bigdata.mongodb.builders;

import java.util.Date;

import com.kschool.bigdata.mongodb.model.Score;

public class ScoreBuilder {
	
	private int score;
	private String comment;
	private Date date;
	
	public ScoreBuilder score(int score){
		this.score = score;
		return this;
	}
	public ScoreBuilder comment(String comment){
		this.comment = comment;
		return this;
	}
	public ScoreBuilder date(Date date){
		this.date = date;
		return this;
	}
	public Score build(){
		return new Score(this);
	}
	public int getScore() {
		return score;
	}
	public String getComment() {
		return comment;
	}
	public Date getDate() {
		return date;
	}

	
}

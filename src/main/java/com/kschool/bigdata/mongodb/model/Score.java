package com.kschool.bigdata.mongodb.model;

import java.util.Date;

import org.mongodb.morphia.annotations.Embedded;

import com.kschool.bigdata.mongodb.builders.ScoreBuilder;
import com.kschool.bigdata.mongodb.fake.FakeGenerator;

@Embedded
public class Score {
	private final static String COMMENTS[] = {"Horrible", "Bad", "Not Bad", "Very Good", "Excelent"};
	
	public Score(ScoreBuilder scoreBuilder) {
		this.score = scoreBuilder.getScore();
		this.comment = scoreBuilder.getComment();
		this.date = scoreBuilder.getDate();
	}
	private int score;
	private String comment;
	private Date date;
	
	public static Score[] fake(int n) {
		Score[] scores = new Score[n];
		for(int i = 0; i < n; i++){
			Score score = new ScoreBuilder()
			.comment(COMMENTS[FakeGenerator.random(0, 4)])
			.date(FakeGenerator.random(1234644240342L, 1444944240342L))
			.score(FakeGenerator.random(0, 10))
			.build();
			scores[i] = score;
		}
		return scores;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Score [score=" + score + ", comment=" + comment + ", date="
				+ date + "]";
	}

}

package com.kschool.bigdata.mongodb.builders;


import com.kschool.bigdata.mongodb.model.Address;
import com.kschool.bigdata.mongodb.model.Restaurant;
import com.kschool.bigdata.mongodb.model.Score;

public class RestaurantBuilder {
	private String name;
	private int capacity;
	private Address address;
	private Score[] scores;
	

	public RestaurantBuilder name(String name){
		this.name = name;
		return this;
	}
	public RestaurantBuilder capacity(int capacity){
		this.capacity = capacity;
		return this;
	}
	public RestaurantBuilder address(Address address){
		this.address = address;
		return this;
	}
	public RestaurantBuilder scores(Score[] scores){
		this.scores = scores;
		return this;
	}
	public Restaurant build(){
		return new Restaurant(this);
	}
	public String getName() {
		return name;
	}
	public int getCapacity() {
		return capacity;
	}
	public Address getAddress() {
		return address;
	}
	public Score[] getScores() {
		return scores;
	}
	
}

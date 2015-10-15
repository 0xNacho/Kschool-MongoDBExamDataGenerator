package com.kschool.bigdata.mongodb.model;
import java.util.Arrays;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;

import com.kschool.bigdata.mongodb.builders.AddressBuilder;
import com.kschool.bigdata.mongodb.builders.RestaurantBuilder;
import com.kschool.bigdata.mongodb.fake.FakeGenerator;
@Entity
public class Restaurant {
	
	@Id private ObjectId id;
	private String name;
	private int capacity;
	@Embedded private Address address;
	@Embedded private Score[] scores;
	
	
	public Restaurant(RestaurantBuilder restaurantBuilder) {
		this.name = restaurantBuilder.getName();
		this.capacity = restaurantBuilder.getCapacity();
		this.address = restaurantBuilder.getAddress();
		this.scores = restaurantBuilder.getScores();
	}


	public static Restaurant fake(){
		Score [] scores = Score.fake(FakeGenerator.random(0, 50));
		return new RestaurantBuilder()
		.name(FakeGenerator.fakeRestaurantName())
		.capacity(FakeGenerator.fakeRestaurantCapacity())
		.address(
				new AddressBuilder()
				.street(FakeGenerator.fakeStreetName())
				.zipCode(FakeGenerator.fakeZipCode())
				.coordinates(FakeGenerator.fakeCoordinates())
				.build()
		)
		.scores(scores)
		.build();
	}


	public ObjectId getId() {
		return id;
	}


	public void setId(ObjectId id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Score[] getScores() {
		return scores;
	}


	public void setScores(Score[] scores) {
		this.scores = scores;
	}


	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", capacity="
				+ capacity + ", address=" + address + ", scores="
				+ Arrays.toString(scores) + "]";
	}
	
	
	
}

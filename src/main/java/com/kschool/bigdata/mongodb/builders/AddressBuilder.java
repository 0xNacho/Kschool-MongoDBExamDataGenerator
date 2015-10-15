package com.kschool.bigdata.mongodb.builders;

import com.kschool.bigdata.mongodb.model.Address;

public class AddressBuilder {
	private String street;
	private float[] coordinates;
	private int zipCode;
	
	public AddressBuilder street(String street){
		this.street = street;
		return this;
	}
	public AddressBuilder coordinates(float[] coordinates){
		this.coordinates = coordinates;
		return this;
	}
	public AddressBuilder zipCode(int zipCode){
		this.zipCode = zipCode;
		return this;
	}
	public Address build(){
		return new Address(this);
	}
	public String getStreet() {
		return street;
	}
	public float[] getCoordinates() {
		return coordinates;
	}
	public int getZipCode() {
		return zipCode;
	}
}

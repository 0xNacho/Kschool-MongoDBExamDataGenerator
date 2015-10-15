package com.kschool.bigdata.mongodb.model;

import java.util.Arrays;

import org.mongodb.morphia.annotations.Embedded;

import com.kschool.bigdata.mongodb.builders.AddressBuilder;

@Embedded
public class Address {


	private String street;
	private float[] coordinates;
	private int zipCode;
	
	public Address(AddressBuilder addressBuilder) {
		this.street = addressBuilder.getStreet();
		this.coordinates = addressBuilder.getCoordinates();
		this.zipCode = addressBuilder.getZipCode();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public float[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(float[] coordinates) {
		this.coordinates = coordinates;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", coordinates="
				+ Arrays.toString(coordinates) + ", zipCode=" + zipCode + "]";
	}
	
	
}

package com.kschool.bigdata.mongodb.fake;

import java.util.Date;
import java.util.Random;

public class FakeGenerator {
	
	private static int index = 0;
	private static int indexStreet = 0;

	private static Random rand = new Random();

	public static String fakeRestaurantName(){
		return "Restaurant-"+(++index);
	}
	public static String fakeStreetName(){
		return "Street-"+(++indexStreet);
	}
	public static int fakeRestaurantCapacity(){
		return rand.nextInt((500 - 31) + 1) + 31;
	}
	public static int fakeZipCode(){
		return rand.nextInt((99999 - 11111) + 1) + 11111;
	}
	public static int random(int min, int max){
		return rand.nextInt((max - min) + 1) + min;
	}

	public static Date random(long min,long max){
		long timestamp = min +  (long)(rand.nextDouble()*(max - min));
		return new Date(timestamp);
	}
		
	public static float[] fakeCoordinates(){
		float[] coords = new float[2];
		coords[0] =  rand.nextFloat() * (50.0f - 30.0f) + 30.0f;
		coords[1] =  rand.nextFloat() * (-2.0f + 4.0f) -2.0f;
		return coords;
	}
}

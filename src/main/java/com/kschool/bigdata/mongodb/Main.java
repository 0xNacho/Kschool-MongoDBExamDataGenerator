package com.kschool.bigdata.mongodb;

import com.kschool.bigdata.mongodb.db.Db;
import com.kschool.bigdata.mongodb.model.Restaurant;



public class Main {
	private static final int NUMBER_OF_FAKE_REGISTERS = 500000;
	public static void main (String[] args){
		for(int i = 0 ; i < NUMBER_OF_FAKE_REGISTERS; i++){
			Restaurant r = Restaurant.fake();
			Db.getDatastore().save(r);
		}
		Db.close();
	}

}

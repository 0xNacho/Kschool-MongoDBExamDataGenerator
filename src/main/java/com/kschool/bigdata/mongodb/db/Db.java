package com.kschool.bigdata.mongodb.db;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.kschool.bigdata.mongodb.model.Address;
import com.kschool.bigdata.mongodb.model.Restaurant;
import com.kschool.bigdata.mongodb.model.Score;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Db {

	private static MongoClient mongoClient;
	private static Datastore ds;
	private static Morphia morphia = new Morphia();

	static{
		mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		morphia.map(Restaurant.class).map(Score.class).map(Address.class);
		ds = morphia.createDatastore(mongoClient, "master");
	}
	public static Datastore getDatastore(){
		return ds;
	}
	public static void close(){
		mongoClient.close();
	}
}

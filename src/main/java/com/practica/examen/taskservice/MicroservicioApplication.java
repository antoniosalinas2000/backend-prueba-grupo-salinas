package com.practica.examen.taskservice;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApplication.class, args);
		MongoClient client = MongoClients.create("mongodb+srv://antoniosalinas00:Up3cex9115@cluster0.krqh1.mongodb.net/?retryWrites=true&w=majority");
		MongoDatabase db = client.getDatabase("practica");
		MongoCollection col = db.getCollection("task-service");
	}

}

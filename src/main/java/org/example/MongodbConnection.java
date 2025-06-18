package org.example;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongodbConnection {
    private static final String URI = "mongodb://localhost:27017";
    private static final String dbName = "student_course_d";
    private static final MongoClient mongoClient = MongoClients.create(URI);

    public static MongoDatabase getDatabase() {
        return mongoClient.getDatabase(dbName);
    }
}


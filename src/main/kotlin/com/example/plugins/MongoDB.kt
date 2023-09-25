package com.example.plugins

import com.mongodb.client.MongoClients
import kotlinx.coroutines.runBlocking
import org.bson.Document


fun configureMongoDB() {
    val connectionString = System.getenv("MONGODB_URI")?.let { it } ?: "mongodb://root:rootpassword@localhost:27017"

    MongoClients.create(connectionString).use { mongoClient ->
        val database = mongoClient.getDatabase("admin")
        runBlocking {
            database.runCommand(Document("ping", 1))
        }
        println("Pinged your deployment. You successfully connected to MongoDB!")
    }
}


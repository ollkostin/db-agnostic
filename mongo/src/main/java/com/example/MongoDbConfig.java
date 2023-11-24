package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Profile("mongo")
@Configuration
@EnableMongoRepositories
public class MongoDbConfig {
}

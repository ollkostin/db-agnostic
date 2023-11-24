package com.example.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@lombok.Data
@Document(collection = "my_collection")
public class Data {
    private ObjectId _id;
    private Identifier identifier;
    private String content;

    @lombok.Data
    public static class Identifier {
        private Integer key1;
        private String key2;
    }
}

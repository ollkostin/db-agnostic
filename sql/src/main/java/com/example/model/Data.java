package com.example.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "data")
@lombok.Data
public class Data {
    @EmbeddedId
    private Identifier identifier;
    private String content;

    @Embeddable
    @lombok.Data
    public static class Identifier {
        private Integer key1;
        private String key2;
    }
}

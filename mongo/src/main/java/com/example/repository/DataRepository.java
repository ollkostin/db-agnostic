package com.example.repository;

import com.example.model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface DataRepository extends MongoRepository<Data, Data.Identifier>, QuerydslPredicateExecutor<Data> {
}

package com.example.repository;

import com.example.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface DataRepository extends JpaRepository<Data, Data.Identifier>, QuerydslPredicateExecutor<Data> {
}

package com.example.dbagnostic;


import com.example.MariaDbConfig;
import com.example.model.Data;
import com.example.model.QData;
import com.example.repository.DataRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication(scanBasePackageClasses = {MariaDbConfig.class})
public class DbAgnosticApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbAgnosticApplication.class, args);
    }

    @Service
    public static class DataService {
        @Autowired
        private DataRepository dataRepository;

        @PostConstruct
        void postConstruct() {
            QData qData = QData.data;
            var dataIdIn = qData.identifier.key2.in(List.of("aa", "bb"));
            var dataIdNotIn = qData.identifier.key2.notIn(List.of("ccc", "ddd"));

            var predicate = dataIdIn.and(dataIdNotIn);
            Iterable<Data> all = dataRepository.findAll(predicate);
            all.forEach(System.out::println);
        }
    }
}

package com.example;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Profile("mariadb")
@Configuration
@EntityScan("com.example.*")
@EnableJpaRepositories("com.example.repository")
public class MariaDbConfig {
}

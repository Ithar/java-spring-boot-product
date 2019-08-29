package com.ithar.malik.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.ithar.malik.domain"})
@EnableJpaRepositories(basePackages = {"com.ithar.malik.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}

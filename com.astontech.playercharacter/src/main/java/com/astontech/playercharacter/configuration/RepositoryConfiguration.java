package com.astontech.playercharacter.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by aarothie1 on 3/30/2017.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.astontech.playercharacter.domain"})
@EnableJpaRepositories(basePackages = {"com.astontech.playercharacter.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}

package com.ihe.AtlasBankingUsers.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.ihe.AtlasBankingUsers.entity")
@EnableJpaRepositories(basePackages = "com.ihe.AtlasBankingUsers.persistence")
@SpringBootApplication (scanBasePackages = "com.ihe.AtlasBankingUsers")
public class AtlasBankingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtlasBankingUserServiceApplication.class, args);
	}

}

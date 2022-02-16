package com.phase3.searchUpdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com")
@ComponentScan(basePackages = "com")
@EntityScan(basePackages = "com")
public class SearchUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchUpdateApplication.class, args);
	}

}

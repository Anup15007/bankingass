package com.cg.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages= {"com.cg.banking"})
@EntityScan(basePackages="com.cg.banking.beans")
@EnableJpaRepositories(basePackages="com.cg.banking.daoservices")
@EnableWebMvc
public class CgBankingPortalSpringBootMvcDataApplication {
	public static void main(String[] args) {
		SpringApplication.run(CgBankingPortalSpringBootMvcDataApplication.class, args);
	}
}
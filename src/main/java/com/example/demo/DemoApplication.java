package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CreditAccount ca = new CreditAccount();
		ca.setOwner("ABCD");
		ca.setBalance(BigDecimal.valueOf(123456.12));
		ca.setInterestRate(BigDecimal.valueOf(12.12));
		ca.setCreditLimit(BigDecimal.valueOf(1234.12));
		
		accountRepository.save(ca);
	}

}

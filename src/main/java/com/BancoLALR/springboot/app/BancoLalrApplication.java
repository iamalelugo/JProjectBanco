package com.BancoLALR.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.BancoLALR.springboot.app.*")
@EntityScan("com.BancoLALR.springboot.app.*")
@SpringBootApplication 
public class BancoLalrApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoLalrApplication.class, args);
	}

}

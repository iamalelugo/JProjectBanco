package com.BancoLALR.springboot.app.models.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.BancoLALR.springboot.app.repository")
public class JpaConfig {
	
}

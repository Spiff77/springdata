package com.peru.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@Import(JpaConfig.class)
@Component
@ComponentScan("com.peru.dao")
public class AppConfig {
	

}

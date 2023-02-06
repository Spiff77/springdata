package com.peru;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.peru.config.AppConfig;


public class Principal {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBeanFactory().createBean(Entry.class).run(args);
	}

}

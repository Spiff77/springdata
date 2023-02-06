package com.peru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.peru.dao.LamaDaoJpa;


public class Principal {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		context.getBeanFactory().createBean(Entry.class).run(args);
	}

}

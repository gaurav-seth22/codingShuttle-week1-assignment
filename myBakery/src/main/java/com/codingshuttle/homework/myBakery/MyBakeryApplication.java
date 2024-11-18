package com.codingshuttle.homework.myBakery;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyBakeryApplication {

	@Autowired
	private CakeBaker cakeBaker;

	public static void main(String[] args) {

		SpringApplication.run(MyBakeryApplication.class, args);
	
	}
	@PostConstruct
	public void bake(){
		cakeBaker.bakeCake();
	}

}

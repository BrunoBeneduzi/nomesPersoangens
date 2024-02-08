package com.naruto.ApiNaruto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import principal.Principal;

@SpringBootApplication
public class ApiNarutoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiNarutoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal pal = new Principal();
		
		pal.iniciar();
		
	}

}

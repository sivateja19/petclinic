package com.app.petclinic.petclinic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetclinicApplication{

	private static final Logger log = LoggerFactory.getLogger(PetclinicApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PetclinicApplication.class, args);
	}

}

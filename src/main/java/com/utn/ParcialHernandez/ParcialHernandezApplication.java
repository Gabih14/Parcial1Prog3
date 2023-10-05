package com.utn.ParcialHernandez;

import com.utn.ParcialHernandez.entities.Persona;
import com.utn.ParcialHernandez.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParcialHernandezApplication {
	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ParcialHernandezApplication.class, args);
	}


}

package com.abhishek.movies;

import org.springframework.boot.SpringApplication; // contains a method call run an to start your spring application you have to call run method and pass application classs to it.
import org.springframework.boot.autoconfigure.SpringBootApplication; // imports spring boot annotation application

@SpringBootApplication

public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
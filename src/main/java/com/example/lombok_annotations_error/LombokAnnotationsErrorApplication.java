package com.example.lombok_annotations_error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LombokAnnotationsErrorApplication {

	public static void main(String[] args) {
		Person person = new Person("Donald", "Duck");
		System.out.println(String.format("Hello %s %s", person.getFirstName(), person.getLastName()));
		log.info("Hello {} {}", person.getFirstName(), person.getLastName());
		SpringApplication.run(LombokAnnotationsErrorApplication.class, args);
	}

}

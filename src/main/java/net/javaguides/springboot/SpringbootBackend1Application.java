package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackend1Application {
	@Autowired 
	private UserRepository Userre;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend1Application.class, args);
	}

}

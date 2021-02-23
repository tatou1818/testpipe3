package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackend1Applicationb {
@Autowired 
private UserRepository Userre;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend1Application.class, args);
	}

}

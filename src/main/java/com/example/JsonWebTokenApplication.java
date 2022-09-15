package com.example;

import com.example.user.User;
import com.example.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JsonWebTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonWebTokenApplication.class, args);
	}


}

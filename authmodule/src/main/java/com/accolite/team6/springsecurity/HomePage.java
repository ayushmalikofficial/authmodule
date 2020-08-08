package com.accolite.team6.springsecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome to AuthModule Application<h1>");
	}
}

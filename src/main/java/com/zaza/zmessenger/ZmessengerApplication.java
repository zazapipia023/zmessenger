package com.zaza.zmessenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching
public class ZmessengerApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(ZmessengerApplication.class, args);
	}

}

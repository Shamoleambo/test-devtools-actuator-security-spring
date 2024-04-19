package com.tidcode.testingdependenciesandstuff.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TheController {

	private static final String template = "Hello %s";

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(@RequestParam(value = "name", defaultValue = "Mano") String name) {
		return ResponseEntity.ok(String.format(template, name));
	}

	@GetMapping("/cookie")
	public ResponseEntity<String> sayCookie() {
		return ResponseEntity.ok("Cookie");
	}
}

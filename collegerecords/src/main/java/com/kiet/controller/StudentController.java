package com.kiet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(value = "/hello/{name}")
	public ResponseEntity<String> helloStudent(@PathVariable String name){
		return ResponseEntity.ok("Hello "+ name);
	}
}

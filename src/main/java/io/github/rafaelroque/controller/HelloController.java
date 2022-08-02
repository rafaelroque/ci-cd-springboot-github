package io.github.rafaelroque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/actions")
public class HelloController {
	
	@GetMapping
	public String index() {
		return "Atualizado 02/08/2022";
	}

}

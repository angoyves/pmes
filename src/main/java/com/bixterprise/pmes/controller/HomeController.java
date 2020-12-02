package com.bixterprise.pmes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accueil")
public class HomeController {


	@GetMapping
	public String direBonjour() {
		
		return "Bonjour Jacob";
	}
	@GetMapping("/bonsoir")
	public String direBonsoir() {
		
		return "Bonsoir Jacob";
	}
	
	
}

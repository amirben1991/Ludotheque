package fr.eni.projetLudotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class ClientController {
	
	@GetMapping("/Clients")
	public String greeting() {
		return "Clients";
	}
	
	
}

package br.com.letscode.moviesbattle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcessoController {

	@GetMapping
	@RequestMapping("/acesso")
	public String login() {
		return "acesso";
	}
	
	@GetMapping
	@RequestMapping("/inicio")
	public String inicio() {
		return "inicio";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError( ) {
		return "redirect:/inicio";
	}
}

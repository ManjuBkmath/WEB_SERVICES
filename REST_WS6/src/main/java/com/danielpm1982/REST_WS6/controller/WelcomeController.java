package com.danielpm1982.REST_WS6.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@Value("${welcomeMessage}")
	private String welcomeMessage;
	@Value("${credits}")
	private String credits;
	@Value("${email}")
	private String email;
	@RequestMapping("/")
	public String showHomePage(Model model) {
		model.addAttribute("welcomeMessage", welcomeMessage);
		model.addAttribute("credits", credits);
		model.addAttribute("email", email);
		return "home";
	}
	@GetMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}
	@GetMapping("/error")
	public String showErrorPage() {
		return "error";
	}
	@GetMapping("/login")
	public String showloginPage() {
		return "login";
	}
	@GetMapping("/accessDenied")
	public String showAccessDeniedPage() {
		return "accessDenied";
	}
}

//This Controller deals with general mapping paths to this web application.

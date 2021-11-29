package it.mycompany.springboot.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String welcome(Model model) {
		model.addAttribute("welcomeMessage", "Hi, today is: " + new java.util.Date());
		return "helloworld";
	}

}

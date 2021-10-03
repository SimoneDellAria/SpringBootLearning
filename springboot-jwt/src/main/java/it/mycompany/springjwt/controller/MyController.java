package it.mycompany.springjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
}
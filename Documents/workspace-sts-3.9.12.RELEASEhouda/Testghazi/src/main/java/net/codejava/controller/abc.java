package net.codejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")

public class abc {
	@GetMapping("/test2")
	public String houda()
	{
		return "ok";
	}
	
	
	

}

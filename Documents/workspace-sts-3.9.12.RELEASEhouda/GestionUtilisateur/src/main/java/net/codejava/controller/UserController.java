package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.entity.User;
import net.codejava.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController
{
	@Autowired
	private UserService userservice;

	
	@GetMapping("/adminregister")
	public void registerAdmin(@RequestBody User user)
	{
		userservice.ajouterAdmin(user);
	}
	
	@GetMapping("/clientreg")
	public void registerClient(@RequestBody User user)
	{
		userservice.ajouterClient(user);
	}
	
	@GetMapping("/agentreg")
	public void registerAgent(@RequestBody User user)
	{
		userservice.ajouterAgent(user);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello()
	{
		System.out.println("getworking");
		return "succes";
	}
	
	@GetMapping("/users")
	@ResponseBody
	public List<User> all()
	{
		List<User> users = userservice.RetrieveUsers();
		return users;
	}
	
	@GetMapping("/login")
	@ResponseBody
	public String auth(@RequestBody User user)
	{
		
		return userservice.login(user);
	}

}

package com.example.demo.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
public class UserController {
	
	@GetMapping("/mine")
	public String message()
	{
		return "This is the message";
	}

}

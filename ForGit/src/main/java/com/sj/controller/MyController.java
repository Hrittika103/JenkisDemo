package com.sj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@GetMapping("/hello")
	public String sayHello()
	{
		return " Hello World From Hrittika";
		
	}
	@GetMapping("/hey")
	public String sayHello()
	{
		return " Hello World From Hrittika  Paul";
		
	}

}

package com.krishna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/krishna/restapi")
public class HelloController {
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String home()
	{
		return "Welcome To Rest API !";
	}
@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name)
	{
		return "Hello "+name+"  Welcome to Micro Services !";
	}
	
}

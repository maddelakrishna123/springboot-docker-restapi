package com.krishna;

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

}

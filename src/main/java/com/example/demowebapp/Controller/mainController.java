package com.example.demowebapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

	@RequestMapping(value="/main")
	public String hello(){
		return "This is my demo WEb Application Deployemnet";
	}
}

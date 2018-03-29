package com.springboot.watertank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass {
	
	
		
		
		@RequestMapping("/get/snacks")
		public String welcome()
		{
			return "Go and have a cake party";
		}
		

	}



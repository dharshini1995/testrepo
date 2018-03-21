package com.springboot.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
	
	@RequestMapping("/")
	public String welcome()
	{
		return "index";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.GET)  
    public ModelAndView save(@ModelAttribute User user){  
        ModelAndView modelAndView = new ModelAndView();  
modelAndView.setViewName("user-data");      
modelAndView.addObject("user", user);    
return modelAndView;  
    }  
	
	

}

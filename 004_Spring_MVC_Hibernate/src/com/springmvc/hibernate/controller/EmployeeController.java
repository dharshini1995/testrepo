package com.springmvc.hibernate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class EmployeeController {
	
	
	 @RequestMapping(value="/home", method=RequestMethod.GET)
	    public ModelAndView welcome()
	    {
	    	return new ModelAndView("index");
	    }
	    }  
	       



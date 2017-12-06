package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexCountrooler {

	
	
	@RequestMapping(value="index.html",method=RequestMethod.GET)//«Î«Û”≥…‰
	public String index(){
		
		
		return "index";
	}
}

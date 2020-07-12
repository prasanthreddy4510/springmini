package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcomemsg")
	public ModelAndView welcome() {
		ModelAndView model=new ModelAndView();
		model.addObject("message","Welcome to spring boot web MVC");
		model.setViewName("welcome");
		return model;
		
	}

}

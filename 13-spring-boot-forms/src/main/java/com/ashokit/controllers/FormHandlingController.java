package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.model.User;

@Controller
public class FormHandlingController {
	
	@GetMapping(value= {"/","register"})
	public String loadForm() {
		
		return "registration";
	}
	
	@PostMapping(value= {"register"})
	public String submitForm(User user,Model model) {
		model.addAttribute("msg", "Registration successful!!");
		return "registerSuccess";
		
	}

}

package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.model.Student;

@Controller
public class FormController {
	@GetMapping(value= {"/","/register"})
	public String loadForm(Model model) {
		Student s=new Student();
		model.addAttribute("student",s);
		return "register";
	}
	
	@PostMapping(value= {"/register"})
	public String submitForm(@ModelAttribute("student")Student s,Model m) {
		
		System.out.println(s);
		m.addAttribute("sucMsg", "successful registraion");
		return "register";
	}
	

}

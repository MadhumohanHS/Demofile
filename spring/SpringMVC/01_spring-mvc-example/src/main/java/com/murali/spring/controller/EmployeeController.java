package com.murali.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.murali.spring.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/validate1")
	public String display(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "viewpage";
	}
	
	@RequestMapping("/validate2")
	public String submitForm( @Valid @ModelAttribute("emp") Employee e, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "viewpage";
		}
		else
		{
		return "final";
		}
	}
	
	
	@RequestMapping("/model")
	public String display(HttpServletRequest req, Model m) {
		// read the provided form data
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if (pass.equals("admin")) {
			String msg = "Hello " + name;
			// add a message to the model
			m.addAttribute("message", msg);
			return "welcome";
		} else {
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}
	}
}

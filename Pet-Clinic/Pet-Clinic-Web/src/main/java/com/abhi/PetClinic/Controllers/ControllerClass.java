package com.abhi.PetClinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@RequestMapping({"","/","index","index.html"})
	public String index() {
		return "index";
	}
	
}

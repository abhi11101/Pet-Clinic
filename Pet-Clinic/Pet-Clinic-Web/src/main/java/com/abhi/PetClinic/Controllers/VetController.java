package com.abhi.PetClinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {

	@RequestMapping({"","/","/index","/index.html"})
	public String index() {
		return "vet/index";
	}
}

package com.abhi.PetClinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

	@RequestMapping({"","/","/index","/index.html"})
	public String index() {
		return "owner/index";
	}
	
}

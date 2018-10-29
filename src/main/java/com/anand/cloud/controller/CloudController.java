package com.anand.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class CloudController {
	@GetMapping("/")
    public String index() {
        return "index";
    }
	@GetMapping("/uploadfile")
	public String uploadPage(ModelMap model) {
		return "uploadfile";
	}
	@GetMapping("/login")
	public String loginPage(ModelMap model) {
		return "login";
	}
	@GetMapping("/register")
	public String registerPage(ModelMap model) {
		return "register";
	}	
}

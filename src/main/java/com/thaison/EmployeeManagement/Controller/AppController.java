package com.thaison.EmployeeManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/management")
	public String goManage() {
		return "/management/index";
	}
	
	@GetMapping("/salary")
	public String goSalary() {
		return "/salary/index";
	}

	@GetMapping("/settings")
	public String goSettings() {
		return "/settings/index";
	}
	
}

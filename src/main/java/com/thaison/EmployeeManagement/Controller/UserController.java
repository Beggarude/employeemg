package com.thaison.EmployeeManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String goUser() {
		return "settings/user";
	}

}

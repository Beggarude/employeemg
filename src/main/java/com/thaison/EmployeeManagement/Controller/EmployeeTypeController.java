package com.thaison.EmployeeManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

	@GetMapping("/employeetypes")
	public String goEmployeeType() {
		return "management/employeetypes";
	}
}
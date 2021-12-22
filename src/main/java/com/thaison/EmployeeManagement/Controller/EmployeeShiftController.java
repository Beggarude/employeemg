package com.thaison.EmployeeManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeShiftController {

	@GetMapping("/schedule")
	public String goEmployeeShift() {
		return "management/schedule";
	}
}

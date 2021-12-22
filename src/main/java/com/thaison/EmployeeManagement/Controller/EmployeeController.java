package com.thaison.EmployeeManagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thaison.EmployeeManagement.Model.Employee;
import com.thaison.EmployeeManagement.Services.BranchService;
import com.thaison.EmployeeManagement.Services.EmployeeService;
import com.thaison.EmployeeManagement.Services.EmployeeTypeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private BranchService branchService;
	@Autowired
	private EmployeeTypeService employeeTypeService;
	
	public Model addModelAttribute(Model model) {
		model.addAttribute("employees", employeeService.findAll());
		model.addAttribute("branches", branchService.findAll());
		model.addAttribute("employeeTypes", employeeTypeService.findAll());
		return model;
	}
	
	//社員のリストを取得
	@GetMapping("/employees")
	public String goEmployeeList(Model model) {
		addModelAttribute(model);
		return "management/employees";
	}
	
	//社員を登録
	@GetMapping("/employeeAdd")
	public String goAddEmployee(Model model) {
		addModelAttribute(model);
		return "management/employeeAdd";
	}
	
	//社員を修正、削除
	@GetMapping("/employee/{op}/{id}")
	public String goEditEmployee(@PathVariable Integer id, @PathVariable String op, Model model) {
		addModelAttribute(model);
		model.addAttribute("employee", employeeService.findById(id));
		return "management/employee" + op;
	}
	
	//社員を保存
	@PostMapping("/employees")
	public String save(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}
	
	@RequestMapping(value = "/employee/Delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
	public String delete(@PathVariable Integer id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}
	
	@RequestMapping(value = "/employee/Update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
	public String update(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}
	
}

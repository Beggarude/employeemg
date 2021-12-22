package com.thaison.EmployeeManagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thaison.EmployeeManagement.Model.Branch;

import com.thaison.EmployeeManagement.Services.BranchService;

@Controller
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@GetMapping("/branches")
	public String goBranchList(Model model) {
		model.addAttribute("branches", branchService.findAll());
		return "management/branches";
	}
	
	@GetMapping("/branchAdd")
	public String goAddBranch() {
		return "management/branchAdd";
	}
	
	@GetMapping("/branches/{op}/{id}")
    public String editCountry(@PathVariable Integer id, @PathVariable String op, Model model){
        Branch branch = branchService.findById(id);
        model.addAttribute("branch", branch);
        return "management/branch"+ op;
    }
	
	@PostMapping(value="/branches")
	public String newBranch(Branch branch) {
		branchService.save(branch);
		return "redirect:/branches";
	}
	
	@RequestMapping(value = "/branch/Delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
	public String delete(@PathVariable Integer id) {
		branchService.delete(id);
		return "redirect:/branches";
	}
	
	@RequestMapping(value = "/branch/Update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
	public String update(Branch branch) {
		branchService.save(branch);
		return "redirect:/branches";
	}
	
}

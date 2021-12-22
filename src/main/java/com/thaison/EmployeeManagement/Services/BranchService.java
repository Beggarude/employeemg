package com.thaison.EmployeeManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaison.EmployeeManagement.Model.Branch;
import com.thaison.EmployeeManagement.Repository.BranchRepository;

@Service
public class BranchService {
	
	@Autowired
	private BranchRepository branchRepo;
	
	//支店のリストを返す
	public List<Branch> findAll(){
		return branchRepo.findAll();
	}
	
	public void save (Branch branch) {
		branchRepo.save(branch);
	}
	
	public void delete (Integer id) {
		branchRepo.deleteById(id);
	}

	public Branch findById(Integer id) {
		return branchRepo.findById(id).orElse(null);
	}
}

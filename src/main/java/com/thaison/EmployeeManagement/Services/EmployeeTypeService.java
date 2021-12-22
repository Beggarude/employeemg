package com.thaison.EmployeeManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaison.EmployeeManagement.Model.EmployeeType;
import com.thaison.EmployeeManagement.Repository.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {

	@Autowired
	private EmployeeTypeRepository employeeTypeRepo;
	
	//支店のリストを返す
	public List<EmployeeType> findAll(){
		return employeeTypeRepo.findAll();
	}
	
	public void save (EmployeeType employeeType) {
		employeeTypeRepo.save(employeeType);
	}
	
	public void delete (Integer id) {
		employeeTypeRepo.deleteById(id);
	}

	public EmployeeType getById(Integer id) {
		return employeeTypeRepo.findById(id).orElse(null);
	}
}

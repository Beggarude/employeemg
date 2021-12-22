package com.thaison.EmployeeManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaison.EmployeeManagement.Model.Employee;
import com.thaison.EmployeeManagement.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	//社員のリストを返す
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	public void save (Employee employee) {
		employeeRepo.save(employee);
	}
	
	public void delete (Integer id) {
		employeeRepo.deleteById(id);
	}

	public Employee findById(Integer id) {
		return employeeRepo.findById(id).orElse(null);
	}
}

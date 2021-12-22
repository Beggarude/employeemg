package com.thaison.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaison.EmployeeManagement.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

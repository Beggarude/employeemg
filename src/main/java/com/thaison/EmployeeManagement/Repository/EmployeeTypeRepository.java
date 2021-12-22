package com.thaison.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaison.EmployeeManagement.Model.EmployeeType;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}

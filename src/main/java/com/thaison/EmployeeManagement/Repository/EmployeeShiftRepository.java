package com.thaison.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaison.EmployeeManagement.Model.EmployeeShift;

@Repository
public interface EmployeeShiftRepository extends JpaRepository<EmployeeShift, Integer> {

}

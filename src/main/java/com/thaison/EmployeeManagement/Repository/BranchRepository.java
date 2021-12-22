package com.thaison.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaison.EmployeeManagement.Model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}

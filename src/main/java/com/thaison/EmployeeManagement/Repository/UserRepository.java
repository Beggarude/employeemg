package com.thaison.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaison.EmployeeManagement.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

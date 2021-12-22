package com.thaison.EmployeeManagement.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property ="id")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	private String address;
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="employeetypeid", insertable=false, updatable=false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	
	@ManyToOne
	@JoinColumn(name="branchid", insertable=false, updatable=false)
	private Branch branch;
	private Integer branchid;
 	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date hireDate;
	
	
}

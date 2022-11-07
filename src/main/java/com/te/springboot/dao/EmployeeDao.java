package com.te.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.te.springboot.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String> {
	public Employee findByEmpId(String empId);//in CrudRepository we use class name and data type of primary  
		@Query("from Employee where empName like 'v%'")
	public List<Employee>getAllEmployee();

}

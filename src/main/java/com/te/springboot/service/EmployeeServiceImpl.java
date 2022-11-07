package com.te.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.EmployeeDao;
import com.te.springboot.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	 private EmployeeDao dao;

	@Override
	public Employee getEmployee(String empId) {
		return dao.findByEmpId(empId);
	}

	@Override
	public Employee register(Employee employee) {
		return dao.save(employee);
	}
	public List<Employee> search(){
		return dao.getAllEmployee();
	}
	@Override
	public void delete(Employee employee){
		 dao.delete(employee);

}

	
}

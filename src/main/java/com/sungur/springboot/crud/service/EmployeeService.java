package com.sungur.springboot.crud.service;

import java.util.List;

import com.sungur.springboot.crud.entity.Employee;



public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}

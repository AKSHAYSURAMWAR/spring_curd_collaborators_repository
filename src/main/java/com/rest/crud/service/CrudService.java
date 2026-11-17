package com.rest.crud.service;


import java.util.List;

import com.rest.crud.Model.Employee;

public interface CrudService {
	
	public List<Employee> getAllData();

	public void saveEmpData(Employee emp);

	public Employee getsingledata(Integer id);
	
	public void deleteDataById(int id);
}

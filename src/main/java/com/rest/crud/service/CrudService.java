package com.rest.crud.service;

import com.rest.crud.Model.Employee;

public interface CrudService {
	
	public void saveEmpData(Employee emp);

	public Employee getsingledata(Integer id);
}

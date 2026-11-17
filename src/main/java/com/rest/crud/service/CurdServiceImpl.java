package com.rest.crud.service;

import org.springframework.stereotype.Service;

import com.rest.crud.Model.Employee;
import com.rest.crud.repository.MyRepository;

@Service
public class CurdServiceImpl implements CrudService {

	private MyRepository repository;

	public CurdServiceImpl(MyRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void saveEmpData(Employee emp) {
		
		repository.save(emp);
		
	}

}

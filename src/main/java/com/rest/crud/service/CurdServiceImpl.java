package com.rest.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.crud.Model.Employee;
import com.rest.crud.repository.MyRepository;

@Service
public class CurdServiceImpl implements CrudService {
	
	MyRepository mr;
	
	public CurdServiceImpl(MyRepository mr) {
		this.mr=mr;
	}
	
	
	@Override
	public List<Employee> getAllData() {
		List<Employee> list= mr.findAll();
		
		return list;
	}

}

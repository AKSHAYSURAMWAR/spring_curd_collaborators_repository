package com.rest.crud.service;

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
	public Employee getsingledata(Integer id) {
		Employee e=mr.findById(id).get();
		return e;
	}

}

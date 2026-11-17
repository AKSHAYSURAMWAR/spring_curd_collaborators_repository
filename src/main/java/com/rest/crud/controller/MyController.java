package com.rest.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.Model.Employee;
import com.rest.crud.service.CrudService;

@RestController
public class MyController {
	
	CrudService cs;
	
	public MyController(CrudService cs) {
		this.cs=cs;
	}
	
	
	@GetMapping("/getAllemp")
	public List<Employee> getAllemp(){
		List<Employee> emp = cs.getAllData();
		return emp;
	}

}

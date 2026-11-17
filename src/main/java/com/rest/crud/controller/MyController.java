package com.rest.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.Model.Employee;
import com.rest.crud.service.CrudService;

@RestController
public class MyController {
	
	CrudService cs;
	
	public MyController(CrudService cs) {
		this.cs=cs;
	}
	
	@GetMapping("/getemp/{id}")
	public Employee getsingleemp(@PathVariable int id) {
		Employee e= cs.getsingledata(id);
		return e;
	}

}

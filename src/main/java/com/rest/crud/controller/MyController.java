package com.rest.crud.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

	@GetMapping("/getemp/{id}")
	public Employee getsingleemp(@PathVariable int id) {
		Employee e= cs.getsingledata(id);
		return e;

	}

	@PostMapping("/saveAllData")
	public String saveEmployeeData(@RequestBody Employee emp) {
		
		cs.saveEmpData(emp);
		
		return "Save";
		
	}
	
	@DeleteMapping("/deleteDataById/{id}")
	public void deleteById(@PathVariable int id) {
		
		cs.deleteDataById(id);
		
	}
}

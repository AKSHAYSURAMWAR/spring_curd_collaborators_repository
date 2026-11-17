package com.rest.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.Model.Employee;
import com.rest.crud.service.CrudService;

@RestController
public class MyController {
	
	private CrudService service;

	public MyController(CrudService service) {
		this.service = service;
	}
	
	@GetMapping("/saveAllData")
	public String saveEmployeeData(@RequestBody Employee emp) {
		
		service.saveEmpData(emp);
		
		return "Save";
		
	}
}

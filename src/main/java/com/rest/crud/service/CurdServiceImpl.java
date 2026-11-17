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
	
	@Override
	public Employee getsingledata(Integer id) {
		Employee e=mr.findById(id).get();
		return e;
	}

	
	@Override
	public void saveEmpData(Employee emp) {
		
		mr.save(emp);

	}

	@Override
	public void deleteDataById(int id) {
		
		mr.deleteById(id);
		
	}

	@Override
	public void updateData(int id, String name) {
		
		Employee employee = mr.findById(id).get();
		
		employee.setName(name);
		
		mr.save(employee);
		
	}

}

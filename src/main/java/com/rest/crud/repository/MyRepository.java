package com.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.crud.Model.Employee;

public interface MyRepository extends JpaRepository<Employee, Integer>{

}

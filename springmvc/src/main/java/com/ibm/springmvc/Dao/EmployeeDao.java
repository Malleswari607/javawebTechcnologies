package com.ibm.springmvc.Dao;

import java.util.List;

import com.ibm.springmvc.model.Employee;



public interface EmployeeDao {
	int save(Employee e);

	int update(Employee e);

}


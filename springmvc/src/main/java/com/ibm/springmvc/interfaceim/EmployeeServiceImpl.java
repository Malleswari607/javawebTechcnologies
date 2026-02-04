package com.ibm.springmvc.interfaceim;

import org.springframework.stereotype.Service;

import com.ibm.springmvc.Dao.EmployeeDao;
import com.ibm.springmvc.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
    private final EmployeeDao employeedao;
	public EmployeeServiceImpl(EmployeeDao employeedao) {
		super();
		this.employeedao = employeedao;
	}
	@Override
	public void insertEmployee(Employee employee) {
		
	employeedao.save(employee);
	}

}

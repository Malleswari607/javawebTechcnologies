package com.ibm.springmvc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private final JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO employee(name,email,phone) VALUES (?,?,?)", e.getName(),
				e.getEmail(), e.getPhone());
	}
	
}

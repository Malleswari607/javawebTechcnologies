package com.ibm.springmvcex1.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.springmvcex1.model.Department;

public class DepartmentDaoImpl implements DepartmentDao {
	private final JdbcTemplate jdbcTemplate;
	
	public DepartmentDaoImpl(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int save(Department d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO department(name,dept_name) VALUES (?,?)",d.getName(),d.getDept_name());
	}


}

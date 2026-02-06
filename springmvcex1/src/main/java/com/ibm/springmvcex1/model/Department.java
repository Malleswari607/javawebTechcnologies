package com.ibm.springmvcex1.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Department {
	@NotBlank(message="Name is required.")
	@Size(min=2,max=50,message="Name should be two or more.")
	private String name;
	@NotBlank(message="department is required.")
	@Size(min=2,max=50,message="Department name should be two or more.")
	private String dept_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}

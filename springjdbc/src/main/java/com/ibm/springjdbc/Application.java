package com.ibm.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.springjdbc.model.Employee;
import com.ibm.springjdbc.templates.EmployeeJDBCTemplate;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeJDBCTemplate employeejdbcTemplate=(EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplateBean");
		System.out.println("---------Records creation---------");
		employeejdbcTemplate.create("smirthi", "Raj", 150000);
		employeejdbcTemplate.create("Allen", "peter", 180000);
		
		System.out.println("------Listing Multiple Records------");
		List<Employee> employees=employeejdbcTemplate.listEmployees();
		for(Employee employee:employees) {
			System.out.println("ID : "+employee.getId());
			System.out.println("First Name : "+employee.getFirstname());
			System.out.println("Last Name : "+employee.getLastname());
			System.out.println("Salary : "+employee.getSalary());
		}
		
//		employeejdbcTemplate.update(2, "Allen","nelson", 200000);
//		Employee employee=employeejdbcTemplate.getEmployee(2);
//		System.out.println("ID : "+employee.getId());
//		System.out.println("First Name : "+employee.getFirstname());
//		System.out.println("Last Name : "+employee.getLastname());
//		System.out.println("Salary : "+employee.getSalary());
		
		employeejdbcTemplate.delete(23);
		
	}
}
package com.ibm.oops.payroll;

public class HR {
	public static Employee recurit(String EmpType) {
		if(EmpType.equalsIgnoreCase("I")) {
			Intern intern=new Intern();
			return intern;
		}
		else if(EmpType.equalsIgnoreCase("P")) {
			PermenanntEmployee pe=new PermenanntEmployee();
			return pe;
		}
		else if(EmpType.equalsIgnoreCase("F")) {
			Freelancer freelancer=new Freelancer();
			return freelancer;
		}
		return null;
	}

}


package com.ibm.oops.payroll;

public class Finanace {
	public void ProcessPay(Employee employee) {
		employee.netpay();
		if(employee instanceof PermenanntEmployee) {
			PermenanntEmployee permenanntEmployee=(PermenanntEmployee) employee;
			permenanntEmployee.Transportation();
		}
	}

}

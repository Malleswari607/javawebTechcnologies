package com.ibm.oops;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.PermenanntEmployee;

public class Application
{
	public static void main( String[] args )
	{
		Employee emp=new PermenanntEmployee();
		emp.netpay();
	}
} 
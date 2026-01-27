package com.ibm.oops;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.Finanace;
import com.ibm.oops.payroll.HR; 
//import com.ibm.oops.payroll.PermenanntEmployee;

public class Application
{
	public static void main( String[] args )
	{
//		Employee emp=new PermenanntEmployee();
//		emp.netpay();
		Finanace finanace=new Finanace();
		Employee emp1=HR.recurit("p");
		if(emp1!=null) {
			System.out.println("permenant employee");
//			emp1.netpay();
			finanace.ProcessPay(emp1);
			
		}
		Employee emp2=HR.recurit("i");
		if(emp2!=null) {
//			emp2.netpay();
			System.out.println("Intern employee");
			finanace.ProcessPay(emp2);
		}
		Employee emp3=HR.recurit("f");
		if(emp3!=null) {
//			emp2.netpay();
			System.out.println("Freelancer Employee");
			finanace.ProcessPay(emp3);
		}
	}
} 
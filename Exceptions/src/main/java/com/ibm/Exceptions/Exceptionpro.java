package com.ibm.Exceptions;

public class Exceptionpro {
	public static void main(String[] args) {
//		try {
//		System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
//		}
//		catch(ArrayIndexOutOfBoundsException exception) {
//			System.out.println("Need to enter the two numbers");
//		}
//		catch(ArithmeticException exception) {
//			System.out.println("cant divide by zero");
//		}
//		catch(NumberFormatException exception) {
//			System.out.println("cant divideby the string give the number");
//		}
//		System.out.println("The End");
//	}
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
			}
		//the above is the multiple catch block
			catch(ArrayIndexOutOfBoundsException  | NumberFormatException exception) {
				System.out.println("Need to enter the two  valid numbers");
			}
			catch(ArithmeticException exception) {
				System.out.println("cant divide by zero");
			}
		//default catch should be at end of all the catch blocks
		 catch(Exception exception) {
			 System.out.println("Unknown error");
			 
		 }
			System.out.println("The End");
		}
}

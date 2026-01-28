package com.ibm.Exceptions;

class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "you need be 18 or more to register";
	}
}
class Voting{
public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}
public class CustomException {
	
public static void main(String[] args) {
	Voting voting=new Voting();
	try {
		voting.register(17);
	} catch (IllegalAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("catch block executed");
	}
	System.out.println("Thr end");
}
}

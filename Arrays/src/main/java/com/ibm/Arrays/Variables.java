package com.ibm.Arrays;

class Test{
	int num;//class scope but instance variable we access them after the creating the object only and every object  has its own copy of the variable
	static int num1;//class scope but class variable we access them using the class name and it has only the one copy of the object
	public void testing(){
		int value;//local scope //local variable
	}
}
public class Variables {
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		t1.num=1;
		t2.num=2;
		Test.num1=3;
		System.out.println("Instance variables:"+t1.num+","+t2.num);
		System.out.println("Class variable:"+Test.num1);
	}

}

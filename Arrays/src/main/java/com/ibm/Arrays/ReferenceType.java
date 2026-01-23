package com.ibm.Arrays;

public class ReferenceType {
	public static void main(String[] args) {
			Integer numbers[];
			numbers=new Integer[5];
			//autoboxing
			numbers[0]=1; 
			numbers[1]=2;
			numbers[2]=3;
			numbers[3]=4;
			numbers[4]=5;
			for(Integer num:numbers) {
				System.out.println(num);
			}
	}

}

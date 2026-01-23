/**
 * 
 */
package com.ibm.clients.cui;

/**
 * 
 */
public class Strings {
	public static void main(String[] args) {
//		String str1,str2,str3;
//		str1="IBM";
//		str2="IBM";
//		str3="ibm";
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		String str1,str2;
		str1= new String("IBM");//boxing
		str2=new String("IBM");
		System.out.println(str1.equals(str2)); 
		Integer num=new Integer(4);//boxing
		Integer num2=9;//auto boxing
		int intavalue=num.intValue();//un boxing
		
	}

}

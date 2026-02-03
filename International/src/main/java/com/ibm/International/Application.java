package com.ibm.International;

import java.text.NumberFormat;
import java.util.Locale;

public class Application
{
	public static void main( String[] args )
	{
		double d=123456.78;
				NumberFormat nf1=NumberFormat.getInstance(Locale.ITALY);
				NumberFormat nf2=NumberFormat.getInstance(Locale.US);
				NumberFormat nf3=NumberFormat.getInstance(Locale.CHINA);
			System.out.println("ITALY representation od  "+d+" : "+nf1.format(d));
			System.out.println("US representation od  "+d+" : "+nf2.format(d));
			System.out.println("CHINA representation od  "+d+" : "+nf3.format(d));
	}
}
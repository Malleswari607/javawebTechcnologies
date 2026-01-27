package com.ibm.typeCastingpro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class typecasting {
	public static void main(String[] args) {
		long l=10;//implicit casting
		float f=(float)10.3;//explicit casting
		Calendar calender=new GregorianCalendar();//up-casting
		GregorianCalendar gregoriancalender=(GregorianCalendar) calender;//down-casting
		System.out.println(calender.get(Calendar.DAY_OF_MONTH));
		List<String> list=new LinkedList<String>();
		if (list instanceof ArrayList) {
			ArrayList<String> arraylist=(ArrayList<String>) list;
		}
	}
}

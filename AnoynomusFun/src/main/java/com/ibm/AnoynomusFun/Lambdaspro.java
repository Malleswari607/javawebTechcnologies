package com.ibm.AnoynomusFun;

interface Printer{
	public void printing();
}
class Process{
	public void execute(Printer printer) {
		printer.printing();
	}
}
public class Lambdaspro {
	public static void main(String[] args) {
		Process process=new Process();
		process.execute(()->System.out.println("HP printer printing"));
		
	}
}

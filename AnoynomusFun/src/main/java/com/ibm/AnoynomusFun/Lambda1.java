package com.ibm.AnoynomusFun;

interface Printer1{
	public void printing(String name);
}
class Process1{
	public void execute(String printername,Printer1 printer) {
		printer.printing(printername);
	}
}



public class Lambda1 {
	public static void main(String[] args) {
		Process1 process=new Process1();
		process.execute("HP",(name)->System.out.println(name+" printer printing"));
		process.execute("Canon",(name)->System.out.println(name+" printer printing"));
		
	}

}

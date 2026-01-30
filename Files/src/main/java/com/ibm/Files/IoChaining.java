package com.ibm.Files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoChaining {
	public static void main(String[] args) {
		short s=123;
		try(DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("./src/main/resources/ibm/bifile1.txt")))){
					out.writeInt(s);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}

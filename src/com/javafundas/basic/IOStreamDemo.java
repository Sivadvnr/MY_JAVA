package com.javafundas.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		FileOutputStream fout = null;
		 try
		 {
			 fin = new FileInputStream("D:\\Java_Learning\\source.txt");
			 fout = new FileOutputStream("D:\\Java_Learning\\dest.txt");
			
			 int content;
			 
			 while((content = fin.read()) != -1) {
				 fout.write((byte) content);
			 }
		 }
		 finally {
			 if(fin != null) {
				 fin.close();
			 }
			 if(fout != null) {
				 fout.close();
			 }
		 }
	}

}

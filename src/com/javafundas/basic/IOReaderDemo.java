package com.javafundas.basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("D:\\Java_Learning\\source.txt");
			writer = new FileWriter("D:\\Java_Learning\\dest.txt");
			
			int content;
			
			while((content = reader.read()) != -1) {
				writer.append((char) content);
			}
		}
		finally {
			if (reader != null)
			{
				reader.close();
			}
			if(writer != null)
			{
				writer.close();
			}
		}
	}

}

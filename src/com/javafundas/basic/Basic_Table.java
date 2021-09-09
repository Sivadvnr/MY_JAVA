package com.javafundas.basic;

import java.util.*;

public class Basic_Table {
	public static void main(String[] args) {
		
		int result = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a number to get table");
		int n = s.nextInt();
		for (int i = 1; i <=20; i++)
		{
			result = n * i;
			System.out.println(n+" X "+i+" = "+result);
			
		}
		s.close();
	}

}

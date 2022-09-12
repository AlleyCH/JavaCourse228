package com.example;

import java.util.Scanner;

public class Welcoming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String q = "ihui" ;
		
		System.out.println("Hello World!"); // System.out.println = console.writeline in c#
		System.out.print("Welcome!\n");   // System.out.print = console.write 
		
		
		int x = 4;
		int y = 8;
		x = 10;
		int sum = x+y;
		System.out.println("Sum = " + sum);
		
		short f = 9234; // can store 4-5 digits (16 bits)
		int t = 912345678; // can store 9-10 digits (32 bits)
		
		// Getting user input 
		
		Scanner input = new Scanner(System.in); // console.readline 
		System.out.print("Enter Your age: ");
		int age = input.nextInt();
		System.out.print(age);
		
		input.close();
		
		example1();
						
	}
	//example1
	private static void example1() {
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter number");
		int num1 = a.nextInt();
		Scanner b = new Scanner(System.in);
		System.out.print("Enter Second number");
		int num2 = b.nextInt();
		System.out.print(num1);
		System.out.print(num2);
				
	}
	
	private static void example2() {
		
		
	}
	
	
			
	

}

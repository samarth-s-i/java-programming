// Java program to find whether even or odd.

package org.mathLogic;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String arg[]) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
//    Using if-else
		if (n % 2 == 0)
		    System.out.println("Even number");
		else
		    System.out.println("Odd number");
		
//    Using ternary operator
		String s=(n%2==0)?"Even Number":"Odd Number";
		System.out.println(s);
	}
}
}
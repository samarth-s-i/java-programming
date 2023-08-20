// Java program to find biggest of three numbers.

package org.mathLogic;

import java.util.Scanner;

public class BiggestOfThree {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter I number: ");
			int n = sc.nextInt();
			System.out.print("Enter II number: ");
			int n1 = sc.nextInt();
			System.out.print("Enter III number: ");
			int n2 = sc.nextInt();
			
//	    Using if-else
//	    if (n > n1 && n > n2)
//	        System.out.println(n+" is the greatest!");
//	    else if (n1 > n2 && n1 > n)
//	    	System.out.println(n1+" is the greatest!");
//	    else
//	    	System.out.println(n2+" is the greatest");
			
//	    Using ternary operator
			int r=(n>n1 && n>n2)?n:(n1>n2 && n1>n)?n1:n2;
			System.out.println(r+" is the greatest");
		}
	}
}

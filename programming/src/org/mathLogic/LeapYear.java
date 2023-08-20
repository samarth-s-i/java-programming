// JP to find entered year is a leap year or not.

package org.mathLogic;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter an year: ");
			int year=sc.nextInt();
			System.out.println((year%400==0 || year%4==0 && year%100!=0)?"Leap year":"Not a leap year");
		}
	}
}

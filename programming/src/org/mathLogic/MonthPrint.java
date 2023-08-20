package org.mathLogic;
import java.util.Scanner;

class MonthPrint {

  public static void main(String[] arg) {
    try (Scanner sc = new Scanner(System.in)) {
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.print("Enter the month(number): ");
		int n = sc.nextInt();
		n = n - 1;
		for (int i = 0; i < month.length; i++) if (n == i) System.out.println(
		  "Month " + (n + 1) + " has " + month[i] + " days"
		);
	}
  }
}

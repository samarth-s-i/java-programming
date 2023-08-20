// Java program to compare two numbers.

package org.mathLogic;
import java.util.Scanner;
public class CompareNum {
	public static void main(String arg[]) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter one number: ");
		int n = sc.nextInt();
		System.out.print("Enter another number: ");
		int n1 = sc.nextInt();
		if (n > n1)
		    System.out.println(n+" is greater than "+n1);
		else if (n < n1)
			System.out.println(n1+" is greater than "+n);
		else
			System.out.println(n+" and "+n1+" are equal");
	}
}
}
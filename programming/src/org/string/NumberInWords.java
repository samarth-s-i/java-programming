package org.string;

import java.util.Scanner;

public class NumberInWords {

	public static void nw(int n, String str) {
		String[] x = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
		String[] y = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		if (n < 20)
			System.out.print(x[n]);
		else
			System.out.print(y[n / 10] + x[n % 10]);
		if (n != 0)
			System.out.print(str + " ");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int amt = sc.nextInt();
		nw(amt / 10000000, "crore");
		nw(amt / 100000 % 100, "lakh");
		nw(amt / 1000 % 100, "thousand");
		nw(amt % 100, "hundred");
		nw(amt % 100, "");
	}
}

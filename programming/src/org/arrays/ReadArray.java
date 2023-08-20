package org.arrays;

import java.util.Scanner;

public class ReadArray {
	static int[] readIntArray(int n) {
		int a[] = new int[n];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		return a;
	}
}

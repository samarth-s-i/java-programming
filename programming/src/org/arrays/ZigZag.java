package org.arrays;

import java.util.Scanner;

public class ZigZag {

	static int[] zigZag(int[] a, int[] b) {
		int i = 0, j = 0, c[] = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			c[i++]=a[i];
			c[j++]=b[i++];
		}
		while(i<a.length)
			c[j++]=a[i++];
		while(i<b.length)
			c[j++]=b[i++];
		return c;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of a: ");
		int n_a = sc.nextInt();
		int a[] = new int[n_a];
		a = ReadArray.readIntArray(n_a);
		System.out.print("Enter the size of b: ");
		int n_b = sc.nextInt();
		int b[] = new int[n_b];
		b = ReadArray.readIntArray(n_b);
		int c[] = new int[a.length + b.length];
		c = zigZag(a, b);
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
	}
}

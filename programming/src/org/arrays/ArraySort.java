package org.arrays;

import java.util.Scanner;

public class ArraySort {
	
	static int[] sortArray(int[] a) {
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i]>=a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a: ");
        int n_a = sc.nextInt();
        int a[] = new int[n_a];
        a=ReadArray.readIntArray(n_a);
        System.out.print("Enter the size of b: ");
        int n_b = sc.nextInt();
        int b[] = new int[n_b];
        b=ReadArray.readIntArray(n_b);
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        c=sortArray(c);
        System.out.println("Array elements of c-");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
	}

}

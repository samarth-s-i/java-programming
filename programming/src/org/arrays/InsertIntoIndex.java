package org.arrays;

import java.util.Scanner;

public class InsertIntoIndex {
	
	static void insertEle(int[] a,int ele,int ind) {
		a[ind]=ele;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a: ");
        int n_a = sc.nextInt();
        int a[] = new int[n_a];
        a=ReadArray.readIntArray(n_a);
        System.out.println("Array before insertion: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
        System.out.print("Enter the element to be inserted: ");
        int ele=sc.nextInt();
        System.out.print("Enter the index the for the insertion: ");
        int ind=sc.nextInt();
        insertEle(a,ele,ind);
        for (int i = 0; i < a.length; i++) {
        	System.out.println("a["+i+"] = "+a[i]);
        }
	}

}

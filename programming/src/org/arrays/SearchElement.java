package org.arrays;

import java.util.Scanner;

public class SearchElement {
	
	static int search(int a[],int ele) {
		for(int i=0;i<a.length;i++)
			if(ele==a[i])
				return i;
		return -1;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:-");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter the element to be fetched: ");
		int ele=sc.nextInt();
		int flag=search(arr,ele);
		if(flag==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at "+flag);
	}

}

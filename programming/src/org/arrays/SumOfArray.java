package org.arrays;

public class SumOfArray {
	
	static int sumArray(int[] x) {
		int sum=0;
		for(int i=0;i<x.length;i++)
			sum+=x[i];
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Sum of integers of the array: "+sumArray(x));
	}

}

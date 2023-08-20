package org.arrays;

public class SmallestOfArray {

	static int smallestNumber(int[] x) {
		int small=x[0];
		for(int i=1;i<x.length;i++)
			if(small>x[i])
				small=x[i];
		return small;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {12,55,234,85,5,214,1};
		System.out.println("Smallest number: "+smallestNumber(x));
	}

}

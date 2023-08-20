package org.arrays;

public class ReverseArray {
	
	static int[] revArray(int x[]) {
		int j=0;
		int[] temp= new int[x.length];
		for(int i=x.length-1;i>=0;i--) {
			if(j<x.length) {
				temp[j]=x[i];
				j++;
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array-");
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		System.out.println("\nReversed Array-");
		x=revArray(x);
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
	}

}

package org.arrays;

public class BiggestOfArray {

	static int getBiggest(int[] ar) {
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
			if(big<ar[i])
				big=ar[i];
		return big;
	}
	
	public static void main(String[] args) {
		
		int[] a= {45,59,12,69,83,120};
		int bg=getBiggest(a);
		System.out.println("Biggest element present in the array: "+bg);

	}

}

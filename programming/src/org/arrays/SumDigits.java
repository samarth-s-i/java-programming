package org.arrays;

public class SumDigits {
	
	static int digiSum(int x[]) {
		for(int i=0;i<x.length;i++) {
			int sum=0;
			while(x[i]>0) {
				sum+=x[i]%10;
				x[i]=x[i]/10;
			}
			x[i]=sum;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {123,55,234,85,5,214,1};
		digiSum(x);
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
	}

}

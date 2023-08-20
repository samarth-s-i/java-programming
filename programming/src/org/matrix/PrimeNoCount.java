package org.matrix;

public class PrimeNoCount {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int[][] mat=mt.matData();
		System.out.println("User entered matrix-\n");
		mt.display(mat);
		System.out.println("No of prime numbers: "+mt.primeNoCount(mat));

	}

}

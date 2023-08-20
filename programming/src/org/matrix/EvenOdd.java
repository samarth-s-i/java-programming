package org.matrix;

public class EvenOdd {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int[][] mat=mt.readMat();
		System.out.println("User entered matrix-\n");
		mt.display(mat);
		System.out.println("No of even numbers: "+mt.countEvenOdd(mat)[0]);
		System.out.println("No of odd numbers: "+mt.countEvenOdd(mat)[1]);
	}

}

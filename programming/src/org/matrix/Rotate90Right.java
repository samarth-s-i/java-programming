package org.matrix;

public class Rotate90Right {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int[][] mat = mt.matData();
		System.out.println("Matrix-");
		mt.display(mat);
		mat = mt.transpose(mat);
		System.out.println("\nAfter transpose:");
		mt.display(mat);
		mt.rowWiseReverse(mat);
		System.out.println("\nAfter rotation:");
		mt.display(mat);
	}

}

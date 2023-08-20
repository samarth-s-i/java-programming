package org.matrix;

public class ColumnWiseReverse {
	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int[][] mat = mt.readMat();
		System.out.println("User entered matrix:");
		mt.display(mat);
		System.out.println("After reversing(Column-Wise):");
		mt.columnWiseReverse(mat);
		mt.display(mat);
	}
}

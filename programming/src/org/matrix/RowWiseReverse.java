package org.matrix;

public class RowWiseReverse {

	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int[][] mat = mt.readMat();
		System.out.println("User entered matrix:");
		mt.display(mat);
		System.out.println("After reversing(Row-Wise):");
		mt.rowWiseReverse(mat);
		mt.display(mat);
	}

}

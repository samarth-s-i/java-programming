package org.matrix;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int[][] mat = mt.readMat();
		System.out.println("User entered matrix-\n");
		mt.display(mat);
		System.out.println("\nAfter transpose-\n");
		mt.display(mt.transpose(mat));
	}
}

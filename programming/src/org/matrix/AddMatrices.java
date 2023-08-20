package org.matrix;

public class AddMatrices {
	public static void main(String[] args) {
		Matrix mt = new Matrix();
		int[][] x = mt.readMat();
		int[][] y = mt.readMat();
		int sum[][] = mt.addMatrices(x, y);
		if (sum == null)
			System.out.println("Addition failed");
		else {
			System.out.println("Addition of two matrices:- \n");
			mt.display(sum);
		}
	}
}

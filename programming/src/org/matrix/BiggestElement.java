package org.matrix;

public class BiggestElement {

	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int[][] x=mt.readMat();
		mt.display(x);
		System.out.println("Biggest: "+mt.getBiggest(x));
		System.out.println("Smalles: "+mt.getSmallest(x));
		System.out.println("Sum: "+mt.sumMat(x));
	}

}

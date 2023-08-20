package org.matrix;

public class RowColumnWiseBiggest {

	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int[][] mat=mt.readMat();
		System.out.println("User entered matrix-");
		mt.display(mat);
		int[] rowBig=mt.rowWiseBiggest(mat);
		int[] colBig=mt.columnWiseBiggest(mat);
		System.out.println("Row-wise Biggest: ");
		for(int i=0;i<rowBig.length;i++)
			System.out.println(rowBig[i]);
		System.out.println("Column-wise Biggest: ");
		for(int i=0;i<rowBig.length;i++)
			System.out.println(colBig[i]);
	}

}

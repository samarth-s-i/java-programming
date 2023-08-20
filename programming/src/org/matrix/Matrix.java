package org.matrix;

import java.util.Scanner;

public class Matrix {
	public int[][] readMat() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the order of the matrix:-");
		System.out.print("No of rows: ");
		int r = sc.nextInt();
		System.out.print("No of columns: ");
		int c = sc.nextInt();
		System.out.println("Enter the Matrix elements: ");
		int mat[][] = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				mat[i][j] = sc.nextInt();
		return mat;
	}

	public void display(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	public int getBiggest(int[][] mat) {
		int big = mat[0][0];
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				if (mat[i][j] > big)
					big = mat[i][j];
		return big;
	}

	public int getSmallest(int[][] mat) {
		int small = mat[0][0];
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				if (mat[i][j] < small)
					small = mat[i][j];
		return small;
	}

	public int sumMat(int[][] mat) {
		int sum = 0;
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				sum += mat[i][j];
		return sum;
	}

	public int[][] addMatrices(int[][] mat1, int[][] mat2) {
		if (mat1.length != mat2.length || mat1[0].length != mat2[0].length)
			return null;
		else {
			int[][] sum = new int[mat1.length][mat1[0].length];
			for (int i = 0; i < mat1.length; i++)
				for (int j = 0; j < mat1[i].length; j++)
					sum[i][j] = mat1[i][j] + mat2[i][j];
			return sum;
		}
	}

	public int[][] transpose(int[][] mat) {
		int temp[][] = new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				temp[j][i] = mat[i][j];
		return temp;
	}

	public int[] countEvenOdd(int[][] mat) {
		int even = 0, odd = 0;
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				if (mat[i][j] % 2 == 0)
					even++;
				else
					odd++;
		int[] count = new int[2];
		count[0] = even;
		count[1] = odd;
		return count;
	}

	public int primeNoCount(int[][] mat) {
		int count = 0;
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++) {
				int num = mat[i][j];
				int c=0;
				boolean flag=true;
				for(int k=1;k<=num;k++) {
					if(num%k==0)
						c++;
				}
				if(c==2)
					flag=false;
				if(flag)
					count++;
			}
		return count;
	}

	public int[] rowWiseBiggest(int[][] mat) {
		int[] big = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			big[i] = mat[i][0];
			for (int j = 0; j < mat[i].length; j++)
				if (mat[i][j] > big[i])
					big[i] = mat[i][j];
		}
		return big;
	}

	public int[] columnWiseBiggest(int[][] mat) {
		int[] big = new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			big[i] = mat[0][i];
			for (int j = 0; j < mat[i].length; j++)
				if (mat[j][i] > big[i])
					big[i] = mat[j][i];
		}
		return big;
	}

	public int[][] rowWiseReverse(int[][] mat) {
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length/2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][mat[i].length - j - 1];
				mat[i][mat[i].length - j - 1] = temp;
			}
		return mat;
	}

	public void columnWiseReverse(int[][] mat) {
		for (int i = 0; i < mat.length / 2; i++)
			for (int j = 0; j < mat[i].length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[mat[i].length - 1 - i][j];
				mat[mat[i].length - 1 - i][j] = temp;
			}
	}

	public int[][] matData() {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		return mat;
	}
}
package org.arrays;

public class EvenOddCount {

	static int[] evenOdd(int x[]) {

		int even = 0, odd = 0;
		for (int i = 0; i < x.length; i++)
			if (x[i] % 2 == 0)
				even++;
			else
				odd++;
		int[] count = { even, odd };
		return count;
	}

	public static void main(String[] args) {
		int x[] = { 0, 21, 43, 62, 5 };
		System.out.println("Number of Even Numbers present: " + evenOdd(x)[0]);
		System.out.println("Number of Odd Numbers present: " + evenOdd(x)[1]);
	}

}

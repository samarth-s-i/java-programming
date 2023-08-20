// Highest Length word.

package org.arrays;

import java.util.Scanner;

public class HighestLength {
	
	static String highestLength(String[] w) {
		String h=w[0];
		for(int i=0;i<w.length;i++) {
			if(h.length()<w[i].length())
				h=w[i];
		}
		return h;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of words: ");
		int n=sc.nextInt();
		String[] words=new String[n];
		System.out.println("Enter "+n+" words");
		for(int i=0;i<n;i++)
			words[i]=sc.next();
		System.out.println("Highest lenght word is: "+highestLength(words));
		
	}

}

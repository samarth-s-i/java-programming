/*
 
 * * * * *

  * * * *

    * * *

      * *

        * 
 
 */


package org.patterns;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner sc=new Scanner(System.in);
		System.out.println("------------Pattern 1-------------\n\n");
		System.out.print("Enter the pattern limit: ");
		int n=sc.nextInt();
		System.out.println("\nPattern-\n");
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=2*(n-i);j++)
				System.out.print(" ");
			for(int j=i;j>0;j--)
				System.out.print("* ");
			System.out.println();
		}
	}

}

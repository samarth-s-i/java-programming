/*


* 

* * 

* * * 

* * * * 

* * * * * 

* * * * 

* * * 

* * 

* 


*/

package org.patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner sc=new Scanner(System.in);
		System.out.println("------------Pattern 3-------------\n\n");
		System.out.print("Enter the pattern limit: ");
		int n=sc.nextInt();
		System.out.println("\nPattern-\n");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++)
				System.out.print("* ");
			System.out.println();
		}
	}

}

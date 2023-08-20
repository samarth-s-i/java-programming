//JP to check prime or not
package org.mathLogic;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter a number: ");
			int num=sc.nextInt();
			
			
//		Method 1
//			int count=0;
//			for(int i=1;i<=num;i++)
//				if(num%i==0)
//					count++;
//			if(count==2)
//				System.out.println("Prime number");
//			else
//				System.out.println("Not a prime number");
			
			
//			Method 2
			boolean flag=true;
			for(int i=2;i<=num/2;i++)
				if(num%i==0)
					flag=false;
			if(flag)
				System.out.println("Prime number");
			else
				System.out.println("Not a prime number");
		}
	}
}

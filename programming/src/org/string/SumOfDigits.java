package org.string;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str1=sc.nextLine();
		int sum=0;
		
//		Using ASCII value
//		for(int i=0;i<str1.length();i++) {
//			char ch=str1.charAt(i);
//			if(ch>='0' && ch<='9') {
//				int num=ch-48;
//				sum+=num;
//			}
//		}
		
		
		
//		Using Character.getNumericValue(var) method
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			int num=Character.getNumericValue(ch);
			if(ch>='0' && ch<='9') {
				sum+=num;
			}
		}
		
		
		System.out.println(sum);
	}
}
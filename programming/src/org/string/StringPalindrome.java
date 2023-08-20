package org.string;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean stringPalindrome(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		boolean rs=stringPalindrome(str);
		System.out.println("Modified string: " + (rs?"Palindrome":"Not a palindrome"));
	}

}
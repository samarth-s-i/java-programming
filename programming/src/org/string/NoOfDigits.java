package org.string;

import java.util.Scanner;

public class NoOfDigits {
	
	public static int noOfDigits(char[] ch) {
		int count=0;
		for(int i=0;i<ch.length;i++)
			if(ch[i]>='0' && ch[i]<='9')
				count++;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.next();
		char[] ch=str.toCharArray();
		System.out.println("No of digits present: "+noOfDigits(ch));
	}

}

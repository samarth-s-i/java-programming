package org.string;

import java.util.Scanner;

public class NoOfSplChar {

	public static int noOfSplChar(char[] ch) {
		int count=0;
		for(int i=0;i<ch.length;i++) {
			int ch1=(int)ch[i];
				if(ch1>=32 && ch1<=47 || ch1>=58 && ch1<=64 || ch1>=91 && ch1<=96 || ch1>=123 && ch1<=126)
					count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.next();
		char[] ch=str.toCharArray();
		System.out.println("No of digits present: "+noOfSplChar(ch));
	}

}

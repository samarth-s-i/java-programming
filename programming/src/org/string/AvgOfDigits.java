package org.string;

import java.util.Scanner;

public class AvgOfDigits {
	
	public static int avgOfDigits(char[] ch) {
		int sum=0,count=0;
		for(int i=0;i<ch.length;i++)
			if(ch[i]>='0' && ch[i]<='9') {
				sum+=(int)ch[i]-48;
				count++;
			}
		System.out.println(count);
		return sum/count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.next();
		char[] ch=str.toCharArray();
		System.out.println("Average of Digits: "+avgOfDigits(ch));
	}

}

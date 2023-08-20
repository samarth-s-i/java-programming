package org.string;

import java.util.Scanner;

public class CapitalSmallLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int uc=0,lc=0,spl=0,num=0;
		System.out.print("Enter the string: ");
		String str1=sc.next();
		
		
//		Using toCharArray() method
//		char[] ch1=str1.toCharArray();
//		for(int i=0;i<ch1.length;i++)
//			if(ch1[i]>='A' && ch1[i]<='Z')
//				uc++;
//			else if(ch1[i]>='a' && ch1[i]<='z')
//				lc++;
//			else if(ch1[i]>='0' && ch1[i]<='9')
//				num++;
//			else
//				spl++;
		
		
//		Using charAt() method-
		for(int i=0;i<str1.length();i++)
			if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
				uc++;
			else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
				lc++;
			else if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
				num++;
			else
				spl++;
		
		System.out.println("No of capital letters: "+uc);
		System.out.println("No of small letters: "+lc);
		System.out.println("No of numbers present: "+num);
		System.out.println("No of special characters: "+spl);
		
	}

}

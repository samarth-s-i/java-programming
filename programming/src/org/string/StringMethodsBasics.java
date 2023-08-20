package org.string;

//import java.util.Scanner;

public class StringMethodsBasics {

	public static void main(String[] args) {
		
		
//		Read the String
//		@SuppressWarnings("resource")
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the string: ");
//		String str1=sc.next();
		
		
		String str1="Samarth";
		
//		String methods------
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.length());
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf('n'));
		
		
		
		char[] ch1=str1.toCharArray();	// Convert String into char array.
		System.out.println(ch1);
		for(int i=0;i<ch1.length;i++)
			System.out.println("ch["+i+"] -> "+ch1[i]);
		char[] ch2= {'s','a','m'};
		
		String str2=new String(ch2);	//Converting char array into String.
		System.out.println(str2);
		
	}

}

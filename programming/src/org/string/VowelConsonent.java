package org.string;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int vw=0,con=0;
		System.out.print("Enter the string: ");
		String str1 = sc.next();

//		Using toCharArray() method
		char[] ch1=str1.toCharArray();
		for(char i:ch1) {
			if(i>='A' && i<='z')
				switch(i) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u': vw++;
							  break;
					default: con++;
				}
		}
		System.out.println("No of vowels: "+vw);
		System.out.println("No of consonents: "+con);
	}

}

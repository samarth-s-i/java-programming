
package org.string;

import java.util.Scanner;

public class ConvertLowerCase {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.next();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char) (ch[i]+32);
			}
		}
		System.out.println(ch);
	}

}

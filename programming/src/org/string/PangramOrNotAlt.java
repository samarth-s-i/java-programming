//Pangram means String should have all 26 alphabets at-least one time
package org.string;

import java.util.Scanner;

public class PangramOrNotAlt {
	public static boolean pangramOrNot(String str) {
		if(str.length()<26)
			return false;
		str=str.toLowerCase();
		for(char ch='a';ch<='z';ch++)
			if(str.indexOf(ch)==-1)
				return false;
		return true;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("String is a "+(pangramOrNot(str)?"Pangram":"Not a pangram"));
	}
}

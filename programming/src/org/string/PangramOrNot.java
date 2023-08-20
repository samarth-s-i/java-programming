//Pangram means String should have all 26 alphabets at-least one time
package org.string;

import java.util.Scanner;

public class PangramOrNot {
	public static boolean pangramOrNot(String str) {
		if(str.length()<26)
			return false;
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122)
				count[ch - 97]++;
			else if (ch >= 65 && ch <= 90)
				count[ch - 65]++;
		}
		for(int i=0;i<count.length;i++)
			if(count[i]==0)
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

//Anangram (by rearranging the characters of I string we've to get the II string.

package org.string;

import java.util.Scanner;

public class AnagramOrNot {
	public static boolean anagramOrNot(String[] str) {
		int[] count = new int[26];
		int[] count1 = new int[26];
		if (str[0].length() == str[1].length()) {
			for (int i = 0; i < str[0].length(); i++) {
				char ch = str[0].charAt(i);
				if (ch >= 97 && ch <= 122)
					count[ch - 97]++;
				else if (ch >= 65 && ch <= 90)
					count[ch - 65]++;
			}
			for (int i = 0; i < str[1].length(); i++) {
				char ch1 = str[1].charAt(i);
				if (ch1 >= 97 && ch1 <= 122)
					count1[ch1 - 97]++;
				else if (ch1 >= 65 && ch1 <= 90)
					count[ch1 - 65]++;
			}
		} else
			return false;
		for (int i = 0; i < 26; i++) {
			if (count[i] != count1[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] str = new String[2];
		System.out.print("Enter I string: ");
		str[0] = sc.nextLine();
		System.out.print("Enter II string: ");
		str[1] = sc.nextLine();
		System.out.println("String is " + (anagramOrNot(str) ? "an Anangram" : "Not an Anangram"));
	}
}

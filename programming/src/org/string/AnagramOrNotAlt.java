//Anangram (by rearranging the characters of I string we've to get the II string.

package org.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNotAlt {
	public static boolean anagramOrNot(String str1, String str2) {
		str1 = str1.replaceAll(" ", "");
		str2 = str2.replaceAll(" ", "");
		if (str1.length() != str2.length())
			return false;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[] ch1 = str1.toCharArray(), ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter I string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter II string: ");
		String str2 = sc.nextLine();
		System.out.println("String is " + (anagramOrNot(str1, str2) ? "an Anangram" : "Not an Anangram"));
	}
}

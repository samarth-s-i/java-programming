package org.string;

import java.util.Scanner;

public class FrequencyOfAlphabets {
	public static int[] frequencyOfAlphabets(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122)
				count[ch - 97]++;
			else if (ch >= 65 && ch <= 90)
				count[ch - 65]++;
		}
		return count;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int count[] = frequencyOfAlphabets(str);
		System.out.println("Modified string: ");
		for (int i = 0; i < count.length; i++)
			if (count[i] != 0)
				System.out.println("Letter " + (char) (i + 65) + "/" + (char) (i + 97) + " is repeated for " + count[i]
						+ " times");
	}
}

package org.string;

import java.util.Scanner;

public class FrequenceOfCharacters {
	public static int[] frequenceOfCharacters(String str) {
		int[] count = new int[128];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		return count;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int count[] = frequenceOfCharacters(str);
		System.out.println("Modified string: ");
		for (int i = 0; i < count.length; i++)
			if (count[i] != 0)
				System.out.println("Letter " + (char) i + " is repeated for " + count[i] + " times");
	}
}

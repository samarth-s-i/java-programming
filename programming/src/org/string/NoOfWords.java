package org.string;

import java.util.Scanner;

public class NoOfWords {
	public static int wordCount(String str) {
		int count = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
				count++;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Sentence contains "+wordCount(str)+" words");
	}
}

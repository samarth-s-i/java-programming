package org.string;

import java.util.Scanner;

public class LastLettterCapital {

	public static String lastLettterCapital(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z')
					ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);
		str = new String(ch);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("After conversion: " + lastLettterCapital(str));
	}

}

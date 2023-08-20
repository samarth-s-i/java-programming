package org.string;

import java.util.Scanner;

public class SwapFirstLastChar {
	public static String swapFirstLastChar(String str) {
		int f = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ')
				f = i;
			else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char t = ch[i];
				ch[i] = ch[f];
				ch[f] = t;
			}
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		str=new String(ch);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Modified string: " + swapFirstLastChar(str));
	}
}

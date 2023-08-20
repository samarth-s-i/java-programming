package org.mathLogic;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int n = 121, r, rev = 0,t=n;
        while (n != 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
            System.out.println(rev);
        }
        if(rev==t){
            System.out.println("Palindrome");
        }
        else
            System.out.println("No");
    }
}
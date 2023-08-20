package org.mathLogic;
import java.util.Scanner;

public class XylamPhloem {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number: ");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
        }
       // int n1=n;
        int last = n % 10;
        int sum1 = last + reverse(n) % 10;
        System.out.println(sum1);
        int n1=n/10;
        int last1,sum=0;
        while(n1!=n && n1!=last){
            last1 = n % 10;
            sum = last1 + reverse(n) % 10;
        }
        System.out.println(sum);
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
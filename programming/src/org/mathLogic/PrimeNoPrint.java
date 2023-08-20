package org.mathLogic;
import java.util.Scanner;
public class PrimeNoPrint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number till you wanna find the prime numbers: ");
            int num = sc.nextInt();
            System.out.println("Prime numbers till " + num);
            for (int i = 1; i <= num; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}

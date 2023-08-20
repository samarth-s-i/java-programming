package org.patterns;
public class PatternStar {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0 ) {
                    System.out.print("\t*\t");
                }
            }
            System.out.print("\n");
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = i; j >= 1; j--) {
                if (i % 2 != 0 ) {
                    System.out.print("\t*\t");
                }
            }
            System.out.print("\n");
        }
    }
}

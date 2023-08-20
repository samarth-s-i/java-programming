package org.mathLogic;

public class LCM {
    public static void main(String[] args) {
        int n1 = 12, n2 = 3, lcm=1;
        if (n1 > n2) {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 || n2 % i == 0) {
                    lcm = i;
                }
            }
        } else {
            for (int i = 1; i <= n1; i++) {
                if (n2 % i == 0 || n1 % i == 0) {
                    lcm = i;
                }
            }
        }
        System.out.println(lcm);
    }
}

package org.mathLogic;
public class Factorial {
    public static void main(String[] args) {
        int n=-1;
        facto(n);
    }
    public static void facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println(fact);
    }
}

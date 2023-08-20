package org.mathLogic;
public class Fibonacci {
    // 0
    // 1
    // 1
    // 2
    // 3
    // 5
    // 8
    // 13
    public static void main(String[] args) {
        int res=0;
        int n1=0;
        int n2=1;
        int i=1;
        System.out.println("0");
        while(i<=5){
            res=n1+n2;
            
            System.out.println(res);
            i++;
        }
    }
}

package org.mathLogic;
public class PalindromeOrNotBoolean {
    public static void main(String[] args) {
        int n=1312;
        if(pal(n))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
    public static boolean pal(int n){
        int rev=0,temp=n;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        if(temp==rev)
            return true;
        return false;
    }
}

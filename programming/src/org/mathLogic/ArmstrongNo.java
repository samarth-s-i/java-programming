package org.mathLogic;


public class ArmstrongNo {
    public static void main(String[] args) {
        int num=123,temp=num;
        int sum=0,r;
        while(num>0){
            r=num%10;
            num=num/10;
            sum=sum+(r*r*r);
            System.out.println(sum);
        }
        if(temp==sum)
            System.out.println("An armstrong number");
        else
            System.out.println("Not an armstrong number");
    }
}

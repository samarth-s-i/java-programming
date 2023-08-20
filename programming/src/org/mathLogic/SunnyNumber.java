package org.mathLogic;

public class SunnyNumber {
    public static void main(String[] args) {
        int n=81;
        int n1=n+1,flag=0;
        for(int i=1;i<=n;i++)
            if((n1)%i==0){
                if(i*i==(n1)){
                    flag=1;
                }
            }
        if(flag==1)
            System.out.println("SUNNY NUMNBER");
        else
            System.out.println("NOT A SUNNY NUMBER");
    }
}

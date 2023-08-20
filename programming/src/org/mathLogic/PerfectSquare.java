package org.mathLogic;

public class PerfectSquare {
    public static void main(String[] args) {
        int n=5;
        int flag=0;
            for(int i=1;i<=n;i++){
                if((n)%i==0){
                    if(i*i==(n)){
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==1)
                System.out.println("Perfect square");
            else
                System.out.println("No");   
    }
}
package org.patterns;
public class PyramidPattern {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i+=2){
            for(int j=1;j<=i;j++){
                System.out.print("\t");
                for(int k=1;k<=j;k++){
                    System.out.println("*");
                }
            }
            System.out.println();
        }
    }
}

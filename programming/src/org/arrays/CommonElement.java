package org.arrays;

import java.util.Scanner;

public class CommonElement {

	static int commonEle(int[] a,int[] b) {
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
					return a[i];
		return -1;
	}
	
//	static int commonEle(int[] c) {
//		for(int i=0;i<c.length;i++)
//			for(int j=i+1;j<c.length;j++)
//				if(c[i]==c[j])
//					return c[i];
//		return -1;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a: ");
        int n_a = sc.nextInt();
        int a[] = new int[n_a];
        a=ReadArray.readIntArray(n_a);
        System.out.print("Enter the size of b: ");
        int n_b = sc.nextInt();
        int b[] = new int[n_b];
        b=ReadArray.readIntArray(n_b);
        
        /*
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        */
        
        if(commonEle(a,b)==-1)
        	System.out.println("No common elements");
        else
//        	System.out.println("Common element: "+commonEle(c));
        	System.out.println("Common element: "+commonEle(a,b));
	}

}

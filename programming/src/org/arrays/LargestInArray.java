package org.arrays;
public class LargestInArray {
    public static void main(String[] args) {
        int[] arr={87,61,93,20,19,43};
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(large<arr[i])
                large=arr[i];
        }
        System.out.println("Largest element: "+large);
    }
}

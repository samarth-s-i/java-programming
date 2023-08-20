package org.arrays;
class array_even{
    public static void main(String[] args) {
        int[] arr={2,3,82,17,96,77,40};
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2==0)
                System.out.println(arr[i]);
    }
}
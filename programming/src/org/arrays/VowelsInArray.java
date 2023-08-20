package org.arrays;
public class VowelsInArray {
    public static void main(String[] args) {
        char c[]={'k','a','h','c','h','a','n','a'};
        int count=0;
        for(int i=0;i<c.length;i++){
            switch(c[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':count++;
            }
        }
        System.out.println("Vowels count: "+count);
    }
}
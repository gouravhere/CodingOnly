package DSA.old;

import java.util.Arrays;

/*
Problem Statement

“Given an array, move all zeros to the end while keeping the relative order of non-zero elements.
For example: [0,1,0,3,12] →  [1,3,12,0,0].
 */
public class MoveZerosToEnd {
    public static void main (String [] args){
        int [] arr = {0,1,0,3,12};
        int pos = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos]=temp;
                pos++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

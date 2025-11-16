package DSA.Revision;

import java.util.Arrays;

public class RA {
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
                while(start<end-1){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
        }
        System.out.printf(Arrays.toString(arr));
    }
}

package DSA.Revision;

import java.util.Arrays;

public class M0s {
    public static void main (String [] args){
        int [] arr ={0,1,0,3,12};
        int start = 0;
        int end = arr.length-1;
        while(arr[start]==0){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.printf(Arrays.toString(arr));
    }

}

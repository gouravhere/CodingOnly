package DSA;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
“Given an array of integers, reverse the array in place.
 For example: [1, 2, 3, 4, 5] → [5, 4, 3, 2, 1]. Don’t use extra space for another array.”
 */
public class ReverseArray {
    public static void main (String [] args){
        int [] arr = {1, 2, 3, 4, 5};
        int start =0;
        int end = arr.length-1;
        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        //using stream
        //Arrays.stream(arr).boxed().collect(Collectors.toList()).reversed().forEach(integer -> System.out.print(integer));
    }
}

package DSA.Revision;

import java.util.Arrays;

public class M0s {
    public static void main (String [] args){
        int [] arr ={0,1,0,3,12};
        int pos = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }

        }
        System.out.printf(Arrays.toString(arr));
    }

}

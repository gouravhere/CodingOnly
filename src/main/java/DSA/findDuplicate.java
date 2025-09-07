package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Week 1 problem: Find duplicates.

Here’s the problem statement:

“Given an array of integers, find all the elements that appear more than once.”
Example:
Input: [1, 2, 3, 2, 4, 1]
Output: [1, 2]
 */
public class findDuplicate {
    public static void main (String [] args){
        int [] arr ={1, 2, 3, 2, 4, 1};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int a:arr){
            if(set.contains(a)){
                duplicates.add(a);
            }
            else
            set.add(a);
        }
        System.out.println(duplicates);
    }
}

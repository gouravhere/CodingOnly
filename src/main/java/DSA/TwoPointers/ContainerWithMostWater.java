package DSA.TwoPointers;
/*
You are given an array height[] where each element represents the height of a vertical line on the x-axis.
Find two lines such that together with the x-axis, they form a container that holds the most water.

Example:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The container is between lines at index 1 and 8:
min(8,7) * (8 - 1) = 7 * 7 = 49.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int left =0;
        int right = height.length-1;
        int maxArea =0;
        while (left<right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area,maxArea);

            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        System.out.println(maxArea);
    }
}

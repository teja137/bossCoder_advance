package arrays_and_maths;
import java.util.*;
public class p1929_leetcode_concatenation_of_Array {
    
    static int[] getConcatenation(int[] nums) {
    int sizeOfArray = nums.length;
    int[] answer = new int[sizeOfArray*2];
    for(int i = 0;i<sizeOfArray;i++){
        answer[i] = nums[i];
        answer[i+sizeOfArray] = nums[i];
    }
    return answer;
    }

public static void main(String[] args) {
    /*
        Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        Specifically, ans is the concatenation of two nums arrays.
        Return the array ans.

        Example 1:
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
    -   ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    -   ans = [1,2,1,1,2,1]

        Example 2:
        Input: nums = [1,3,2,1]
        Output: [1,3,2,1,1,3,2,1]
        Explanation: The array ans is formed as follows:
    -   ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
    -   ans = [1,3,2,1,1,3,2,1]
     */

     int[] nums = {1,3,7};
     System.out.println(Arrays.toString(getConcatenation(nums)));
}
}

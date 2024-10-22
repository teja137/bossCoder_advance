package bossCoder_beginner.practise.learn_22_10_2024;
import java.util.*;
public class p1_leetcode_two_sum {

    /*

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        
        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        
        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1
]
     */

     // brute force approach
     static int[] checktarget(int[] nums, int target){
        int sizeOfNums = nums.length;
        for(int i = 0;i<sizeOfNums;i++){
            for(int j = i+1;j<sizeOfNums;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[0];
     }

     // hashmap approach
     static int[] checkTarget(int[] nums, int target){
        int sizeOfNums = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<sizeOfNums;i++){
            int compliment = target - nums[i]; // 8:7:6:5:4
            if(map.containsKey(compliment)){
                return new int[]{compliment,nums[i]};
            } else {
                map.put(nums[i],i); // 1,0:2,1:3,2:4,3
            }
        }
        return new int[0];
     }

     public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 9;
        System.out.println("Brute fore approach: "+Arrays.toString(checktarget(nums, target)));
        System.out.println("Hashmap approach: "+Arrays.toString(checkTarget(nums, target)));
     }

}

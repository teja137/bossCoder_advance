package arrays_and_maths;

import java.util.*;

public class p412_leetcode_Fizz_buzz {
    
    static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
                result.add("FizzBuzz");
            } else if(i%3 == 0){
                result.add("FizzBuzz");
            } else if(i%5 == 0){
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
                // result.add(String.valueOf(i));
                // result.add(i+"");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*
            Given an integer n, return a string array answer (1-indexed) where:

            answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
            answer[i] == "Fizz" if i is divisible by 3.
            answer[i] == "Buzz" if i is divisible by 5.
            answer[i] == i (as a string) if none of the above conditions are true.
 

            Example 1:

            Input: n = 3
            Output: ["1","2","Fizz"]
            Example 2:

            Input: n = 5
            Output: ["1","2","Fizz","4","Buzz"]
         */

         System.out.println(fizzBuzz(37));
    }
}
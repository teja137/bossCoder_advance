package math_implementation_lab;

public class p470_leetcode_implement_Rand10_using_Rand7 {
    static int rand7(){
        return 1+(int)(Math.random() * 7);
    }
    static int rand10(){
        int res = 40;
        while(res>=40){
            res = 7*(rand7()-1)+(rand7()-1);
        }
        return res;
    }
    public static void main(String[] args) {
        /*
            Given the API rand7() that generates a uniform random integer in the range [1, 7], write a function rand10() that generates a uniform random integer in the range [1, 10]. You can only call the API rand7(), and you shouldn't call any other API. Please do not use a language's built-in random API.

            Each test case will have one internal argument n, the number of times that your implemented function rand10() will be called while testing. Note that this is not an argument passed to rand10().

            Example 1:
            Input: n = 1
            Output: [2]
            
            Example 2:
            Input: n = 2
            Output: [2,8]
            
            Example 3:
            Input: n = 3
            Output: [3,8,10]
         */

         System.out.println(rand10());
        
    }

}

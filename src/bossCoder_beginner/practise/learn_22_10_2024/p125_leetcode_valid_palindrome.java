package bossCoder_beginner.practise.learn_22_10_2024;

/**
 * p125_leetcode_valid_palindrome
 */
public class p125_leetcode_valid_palindrome {
    static boolean palindromeCheck(String text){
        text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = text.length() - 1;
        while(left<right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
        
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
        
        Given a string s, return true if it is a palindrome, or false otherwise.
 

        
        Example 1:
        Output: true
        Input: s = "A man, a plan, a canal: Panama"
        Explanation: "amanaplanacanalpanama" is a palindrome.

        Example 2:
        Output: false
        Input: s = "race a car"
        Explanation: "raceacar" is not a palindrome.
        
        Example 3:
        Output: true
        Input: s = " "
        Since an empty string reads the same forward and backward, it is a palindrome.
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
         */

        String text = "xam max";
        System.out.println(palindromeCheck(text));
    }
}
package bossCoder_beginner.practise.learn_23_10_2024;

/**
 * p415_leetcode_add_strings
 */
public class p415_leetcode_add_strings {

    public static void main(String[] args) {
        String nums1 = "11";
        String nums2 = "123";
        String answer = "";
        //output = 134
        for(int i = 0; i<nums1.length();i++){
            int number1 = nums1.charAt(i);
            System.out.println(number1);
            int number2 = 0;
            for(int j = 0; j<nums2.length();j++){
                number2 = nums2.charAt(j);
                System.out.println(number2 + " - j= "+j);
            }
            answer = number1 + "" + number2;
        }
        System.out.println(answer);

        //unable to do it
    }
}
package bossCoder_beginner.practise.learn_23_10_2024;

import java.util.Arrays;

/**
 * p26_leetcode_remove_duplicates_from_a_sroted_array
 */
public class p26_leetcode_remove_duplicates_from_a_sroted_array {

    static int[] removeDuplicate(int[] input){
        int sizeOfInput = input.length;
        if (sizeOfInput == 0) return new int[0];
        int[] array = new int[sizeOfInput];
        array[0] = input[0];
        int k = 1;
        for(int i = 1; i<sizeOfInput;i++){
            if(input[i] != input[i-1]){
                array[k] = input[i];
                k++;
            }
        }
        return Arrays.copyOf(array, k);
    }
    public static void main(String[] args) {
        int[] input = {1,1,2,2,3,3,4};
        // output = 4;
        int[] uniqueArray = removeDuplicate(input);
        System.out.println(Arrays.toString(uniqueArray));
        System.out.println(uniqueArray.length);
    }
}
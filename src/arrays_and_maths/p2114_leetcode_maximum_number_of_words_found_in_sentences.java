package arrays_and_maths;

public class p2114_leetcode_maximum_number_of_words_found_in_sentences {

    static int mostWordsFound(String[] sentences) {
        int sizeOfString = sentences.length;
        int count = 0;
        for(int i = 0; i<sizeOfString;i++){
            String singleSentence = sentences[i];
            int counter = 1;
            for(int j = 0; j<singleSentence.length();j++){
                if(singleSentence.charAt(j) == ' '){
                    counter++;
                }
                if(count < counter){
                    count = counter;
                }
            }
        }
        return count;
    }

    static int mostWordsFoundOptimized(String[] sentences) {
        int maxWords = 0;
        for(String sentence:sentences){
            System.out.println();
            int wordCount = sentence.split(" ").length;

            maxWords = Math.max(maxWords,wordCount);
        }
        return 12;
    }

    public static void main(String[] args) {
        /*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

 

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
Example 2:

Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.
         */

         String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
         System.out.println(mostWordsFound(sentences));
         System.out.println("optmized way - "+mostWordsFoundOptimized(sentences));


    }

}

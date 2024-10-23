 
 package bossCoder_beginner.practise.learn_22_10_2024.learn_23_10_2024;
 
 /**
  * p258_add_digits
  */
 public class p258_add_digits {

    static int addDigits(int num){
// we will be using divisiblity rule of 9.
    if(num == 0){
        return 0;
    }
    if(num%9 == 0){
        return 9;
    }
        return num%9;
}

    public static void main(String[] args) {
        int nums = 137;
        // int answer = 0;
        // while(nums!=0){
        //     System.out.println("Hello");
        //     int lastNum = nums%10;
        //     answer += lastNum;
        //     nums /=10;
        // }
        // System.out.println(answer);
        System.out.println(addDigits(nums));
    }
 }
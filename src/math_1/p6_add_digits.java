package math_1;

public class p6_add_digits {

    static int solve(int num){
        if(num == 0){
            return 0;
        } else if(num%9 == 0){
            return 0;
        } else {
            return num%9;
        }
    }
public static void main(String[] args) {
    int num = 17;
    System.out.println(solve(num));
}
}

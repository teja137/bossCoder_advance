package bit_manipulation;

public class q1 {
    public static void main(String[] args) {
        // find if the kth bit is set in the given integer. if n=29 and k = 3

        // binary representation of 29 is:
        // 29/2=14,1
        // 14/2=7,0
        // 7/2=3,1
        // 3/2=1,1
        // 1/2=0,1

        // 29 is binary is 11101
        // 11101 in integer is:

        // 2^0*1+2^1*0+2^2*1+2^3*1+2^4*1 = 1+0+4+8+16 = 29

        int n =29; // 11101
        int k = 3;
        
        // using left shift
        int one = 1;

        if((one<<(k-1)&n) != 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // using right shift
        if(((n>>k-1)&one) != 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

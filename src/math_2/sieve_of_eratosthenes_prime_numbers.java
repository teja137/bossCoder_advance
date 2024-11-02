package math_2;
import java.util.*;
public class sieve_of_eratosthenes_prime_numbers {

    public static void main(String[] args) {
        int printPrimeNumbers = 3;
        boolean[] primeNumbers = new boolean[printPrimeNumbers+1];
        Arrays.fill(primeNumbers,true);
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        for(int i = 2;  i*i<=printPrimeNumbers;i++){
            if(primeNumbers[i]){
                for(int j = i*i;j<=printPrimeNumbers;j+=i){
                    primeNumbers[j] = false;
                }
            }
        }

        System.out.println(Arrays.toString(primeNumbers));

        for(int i = 2; i<=printPrimeNumbers;i++){
            if(primeNumbers[i]){
                System.out.println(i+" ");
            }
        }
    }
}
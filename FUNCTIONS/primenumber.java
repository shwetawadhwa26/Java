import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<=1){ //false for -ve numbers
            return false;
        }
        int c = 2;
        while(c*c <=n){ //Check divisors up to the square root of n
            if(n%c==0){ //false for even numbers
                return false;
            }
            c++; //increment c from 2 to 3 
        }
        return true; 
    }
    
}

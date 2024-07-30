import java.util.Scanner;

public class upperlowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if(ch>=65 && ch<=90){
            System.out.println("Uppercase letter");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("Lowercase letter");
        }
        
    }
    
}

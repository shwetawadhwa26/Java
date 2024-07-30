//FIND largest out of 3 numbers using java 

import java.util.Scanner;

public class largestdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int c = in.nextInt();
        // if(a>b && b>c){
        //     System.out.println(a + " is the largest digit");
        // }
        // else if(b>a && b>c){
        //     System.out.println(b + " is the largest digit");
        // }
        // else{
        //     System.out.println(c + " is the largest digit");

        // }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max+ " is the largest digit ");
    }
    
}

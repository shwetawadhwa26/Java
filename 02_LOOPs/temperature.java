//F=9/5 * C+32

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter temp in C: ");
        float tempc = in.nextFloat();
        float tempF = (tempc*9/5)+32;
        System.out.println("temp in Fahrenheit = "+ tempF);
       
    
}
}
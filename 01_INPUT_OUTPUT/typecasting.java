import java.util.Scanner;

public class typecasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // float num1 = input.nextFloat();
        
        // System.out.println(num1);

        // int num2 =input.nextInt();
        // System.out.println(num2);

        // //type casting
        // int num3 = (int)(65.77f);
        // System.out.println(num3);


        // //automatic type promotion inn expressions
        // int a = 257;
        // byte b = (byte)(a);//257%256=1

        // System.out.println(b);


        // int j = 356;
        // byte k = (byte)(j);//356%256=100

        // System.out.println(k);


        // byte m=40;
        // byte n = 50;
        // byte o = 100;
        // int p = m*n/o;

        // System.out.println(p);

        // byte x= 50;

        // int number ='A';
        // System.out.println(number);


        // System.out.println("안녕하세요");

        byte q=42;
        char c='a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*q)+(i/c)-(d-s);
        System.out.println((f*q)+" "+(i/c)+" "+(d-s));
        System.out.println(result);
        



        






    }
    
}

import java.util.Scanner;

public class primitive{
    
    public static void main(String[] args) {
        int rollno = 847;

        //string is not primitive
        char letter='s';
        float marks = 98.67f;

        double largedeicmalnumber = 888765.997764;
        long phoneno = 7988003062L;
        boolean check = true;

        String name = "shweta";
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println("Hello World!");

        System.out.println(rollno);
        System.out.println(marks);
        System.out.println(letter);
        System.out.println(largedeicmalnumber);
        System.out.println(phoneno);
        System.out.println(check);
        System.out.println(name);
        

        input.close();

    }

} 
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your rollno is = "+ rollno);

    
        long a = 230_99_999_999L;
        System.out.println(a);
        input.nextLine();

        String name= input.nextLine();
        System.out.println(name);
    }
    
}

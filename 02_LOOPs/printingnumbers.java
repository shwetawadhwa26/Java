//1
//2
//3
//4
//5

//hello
//hello
//hello  
//hello
//hello

import java.util.Scanner;

public class printingnumbers {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=5;i++){
            System.out.println(i+" ");
        }

        for(int num =0;num<=5;num++){
            System.out.println("HELLO");
        }

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int nume=1;nume<=n;nume++){
            System.out.println(nume);
        }
        
    }
    
}




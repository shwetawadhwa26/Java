
// import java.util.Scanner;

// public class evenletterwords {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();

//         for(String s : input.split("\\s+")){
//             if(s.length()%2==0){
//                 System.out.println(s);
//             }
//         }
//     }
    
// }

import java.util.Scanner;
public class evenletterwords{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(String s: input.split("\\s+")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }

}

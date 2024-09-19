//Way 1

import java.util.Scanner;
public class totaloccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==str1.charAt(0)){
                count++;
            }
        }
System.out.println(count);
    }
}

//Way 2

// import java.util.Scanner;

// public class totaloccurrence {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str = scanner.nextLine();
//         char ch = scanner.nextLine().charAt(0);
//         System.out.println(str.length() - str.replace(String.valueOf(ch), "").length());
//     }
// }


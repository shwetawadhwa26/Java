import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if(i!=0){
                System.out.print(".");
            }
        }
    }
}

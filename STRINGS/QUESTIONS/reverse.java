import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";  

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        System.out.println("Reversed String: " + result);
    }
}

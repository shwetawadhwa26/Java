import java.util.Scanner;

public class SwapFirstAndLastChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.length() < 2) {
            System.out.println(input);
            // Swap first and last characters
            String result = input.charAt(input.length() - 1) +
                            input.substring(1, input.length() - 1) +
                            input.charAt(0);
            System.out.println(result);
        }
        scanner.close();
    }
}

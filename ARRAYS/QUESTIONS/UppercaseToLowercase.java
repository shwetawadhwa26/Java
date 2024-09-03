

public import java.util.Scanner;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine(); // Read the entire line of input
        char[] ch = input.toCharArray();   // Convert the string to a character array

        for (int index = 0; index < ch.length; index++) {
            char currCharacter = ch[index];
            if (currCharacter >= 'A' && currCharacter <= 'Z') {
                ch[index] = (char)(currCharacter + 32);
            }
        }

        String result = new String(ch);    // Convert the character array back to a string
        System.out.println("Lowercase string: " + result);
    }
}
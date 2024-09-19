import java.util.Scanner;

public class vowelconsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count =0;
        int vowels =0;
        int consonant=0;
        int number =0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch != ' ') {
                count++;  
            }
            
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } 
           
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonant++;
            } 
            // Check for digits
            else if (ch >= '0' && ch <= '9') {
                number++;
            }
        }

        System.out.println("Character count: " + count);
        System.out.println("Vowel count: " + vowels);
        System.out.println("Consonant count: " + consonant);
        System.out.println("Number count: " + number);


        
    }

    
}

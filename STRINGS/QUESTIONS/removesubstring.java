//input abbcbaddcbabbbaac
//part cba
//output abbddbbbaac


import java.util.Scanner;

class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the part to remove: ");
        String part = scanner.nextLine();

        // Create a Solution object and call the method
        Solution solution = new Solution();
        String result = solution.removeOccurrences(s, part);
        System.out.println("Resulting string: " + result);
    }
}


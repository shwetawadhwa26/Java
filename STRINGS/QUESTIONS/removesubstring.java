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
        String s = scanner.nextLine();
        String part = scanner.nextLine();

        Solution solution = new Solution();
        String result = solution.removeOccurrences(s, part);
        System.out.println("Resulting string: " + result);
    }
}


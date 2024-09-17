public class adjacent {

    // Method to remove adjacent duplicates
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder(); 
        int index = 0;

        // Traverse the string
        while (index < s.length()) {
            // Check if the last character in ans is equal to the current character in the string
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == s.charAt(index)) {
                ans.deleteCharAt(ans.length() - 1); // Remove the last character if it's the same
            } else {
                ans.append(s.charAt(index)); // Otherwise, append the current character
            }
            index++;
        }

        return ans.toString(); 
    }

    public static void main(String[] args) {
        adjacent obj = new adjacent();
        String input = "abbaca";
        
        // Call the method to remove adjacent duplicates
        String result = obj.removeDuplicates(input);
        
        // Print the result
        System.out.println("Output after removing adjacent duplicates: " + result);
    }
}

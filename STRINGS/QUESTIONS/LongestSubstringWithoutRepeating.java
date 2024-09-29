public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[256]; // Array to store the last index of each character (assuming ASCII set)
        for (int i = 0; i < 256; i++) {
            charIndex[i] = -1; // Initialize all values to -1 (indicating character has not been seen yet)
        }

        int maxLength = 0;  // Tracks the maximum length of substring without repeating characters
        int start = 0;  // Sliding window's starting index

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character has been seen and its last occurrence is within the current window
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1; // Move the start to one position after the last occurrence
            }

            // Update the character's last index
            charIndex[currentChar] = end;

            // Calculate the max length of substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(s)); // Output: 3 (wke)
    }
}

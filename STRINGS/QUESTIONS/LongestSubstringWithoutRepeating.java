public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[256]; 
        for (int i = 0; i < 256; i++) {
            charIndex[i] = -1; 
        }

        int maxLength = 0;  
        int start = 0;  

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1; 

            charIndex[currentChar] = end;

            // Calculate the max length of substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(s)); // Output:
                                                                                                                        // 3
                                                                                                                        // (wke)
    }
}

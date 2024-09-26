static int countPalindrome(String str) {
    // Split the string into words
    String[] words = str.split("\\s+"); // Splitting on spaces
    int count = 0;

    // Iterate over each word
    for (String word : words) {
        // Convert to lowercase for case-insensitive comparison
        String lowerWord = word.toLowerCase();

        // Check if the word is a palindrome
        if (isPalindrome(lowerWord)) {
            count++;
        }
    }

    return count;
}

// Helper function to check if a word is palindrome
static boolean isPalindrome(String word) {
    int left = 0, right = word.length() - 1;

    while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

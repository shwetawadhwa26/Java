public class movezeros {
    public void moveZerosToEnd(int[] nums, int n) {
        int j = 0;  // Pointer to track the position of non-zero elements

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element to the front
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;  // Move the pointer to the next position
            }
        }

        // Print the array after moving zeros to the end
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        movezeros obj = new movezeros();
        int[] nums = {0, 1, 0, 3, 12};  // Example input array
        int n = nums.length;
        obj.moveZerosToEnd(nums, n);  // Function call
    }
}

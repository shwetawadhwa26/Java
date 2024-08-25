public class movezeros {
    public void moveZerosToEnd(int[] nums) {
    int j = 0;  // Pointer for tracking the position of non-zero elements
    
    // Traverse the array
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            // Swap elements
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;  // Move the non-zero pointer forward
        }
    }
}

}

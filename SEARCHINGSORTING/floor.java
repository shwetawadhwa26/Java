public class floor{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15; // Example target value
        int ans = flooring(arr, target);
        
        if (ans == -1) {
            System.out.println("No ceiling found for the target.");
        } else {
            System.out.println("Ceiling of " + target + " is: " + ans);
        }
    }

    static int flooring(int[] arr, int target) {
        // If the target is greater than the greatest number in the array, no ceiling exists
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // If target is found, return the element itself
            }
        }
        
        
        return arr[end];
    }
}

import java.util.Scanner;

public class binarysearch {
    public static int binarySearch(int[] arr, int n, int target) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // Calculate mid index

            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (target > arr[mid]) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of array: ");
        int n = scanner.nextInt(); // Read size of the array
        int[] arr = new int[n]; // Declare the array

        System.out.print("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter your target: ");
        int target = scanner.nextInt(); 
        int result = binarySearch(arr, n, target);

        if (result == -1) {
            System.out.println("Element not present in the array.");
        } else {
            System.out.println(target + " element found at index: " + result);
        }
    }
}

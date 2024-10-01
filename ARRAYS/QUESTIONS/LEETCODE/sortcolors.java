
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color 
//are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

import java.util.Scanner;

public class sortcolors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        // Reading input into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = 0;
        int index = 0;
        int right = arr.length - 1;


        while (index <= right) {
            if (arr[index] == 0) {
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
                left++;
                index++;
            } else if (arr[index] == 2) {
                int temp = arr[index];
                arr[index] = arr[right];
                arr[right] = temp;
                right--;  
            } else {
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Given an array nums with n objects colored red, white, or blue, sort them
// in-place so that objects of the same color
// are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and
// blue, respectively.
// You must solve this problem without using the library's sort function.
// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

import java.util.Scanner;

public class sortcolors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        // Reading input into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = 0;
        int index = 0;
        int right = arr.length - 1;

        while (index <= right) {
            if (arr[index] == 0) {
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
                left++;
                index++;
            } else if (arr[index] == 2) {
                int temp = arr[index];
                arr[index] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

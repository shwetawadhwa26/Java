

// public class ceiling {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 9, 14, 16, 18};
//         int target = 16;
//         int ans = ceiling(arr, target);
//         System.out.println(ans);
//     }
//     static int ceiling(int[] arr, int target) {

//         // but what if the target is greater than the greatest number in the array
//         if (target > arr[arr.length - 1]) {
//             return -1;
//         }
//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }
//         return start;
//     }
// }


public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15; // Example target value
        int ans = ceiling(arr, target);
        
        if (ans == -1) {
            System.out.println("No ceiling found for the target.");
        } else {
            System.out.println("Ceiling of " + target + " is: " + ans);
        }
    }

    static int ceiling(int[] arr, int target) {
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
        
        // At the end of the loop, start is the index of the smallest number >= target (the ceiling)
        return arr[start];
    }
}

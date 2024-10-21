public class mergesort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;      // Starting index of the first subarray
        int idx2 = mid + 1; // Starting index of the second subarray
        int x = 0;          // Index for the merged array
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];}
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: when the subarray has 1 or 0 elements
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);     // Sort the left half
        divide(arr, mid + 1, ei); // Sort the right half
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        divide(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static int getKthGreatestElement(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            int element = arr[i];
            if (element > pq.peek()) {
                pq.poll();  // Remove the smallest element
                pq.add(element);
            }
        }
        return pq.peek();
    }
    public static int getKthSmallestElement(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            int element = arr[i];
            if (element < pq.peek()) {
                pq.poll();  // Remove the largest element
                pq.add(element);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 4, 15};
        int n = arr.length;
        int k = 3;  // You can change this value to any k you want

        int greatest = getKthGreatestElement(arr, n, k);
        System.out.println("The " + k + "-th greatest element is: " + greatest);

        int smallest = getKthSmallestElement(arr, n, k);
        System.out.println("The " + k + "-th smallest element is: " + smallest);
    }
}

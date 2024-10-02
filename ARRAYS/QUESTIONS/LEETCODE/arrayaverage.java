public class ArrayAverage {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {4, 8, 12},
            {7, 10, 13},
            {5, 9, 11}
        };

        // Calculate and print the average of each row
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            double average = (double) sum / array[i].length;
            System.out.println("Average of row " + (i + 1) + ": " + average);
        }
    }
}

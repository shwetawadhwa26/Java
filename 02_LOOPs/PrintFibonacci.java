public class PrintFibonacci {

    // Method to print Fibonacci sequence up to the given count
    public static void printFibonacciSequence(int count) {
        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        int c;     // Variable to hold the next Fibonacci number

        // Loop to print Fibonacci sequence
        for (int i = 1; i <= count; i++) {
            System.out.print(a); // Print the current Fibonacci number
            
            // If it's not the last number, print a comma and space
            if (i < count) {
                System.out.print(", ");
            }

            // Update the variables to get the next number in the sequence
            c = a + b; // Next number is the sum of the previous two
            a = b;     // Move the second number to the first
            b = c;     // Move the next number to the second
        }
    }

    public static void main(String[] args) {
        int count = 10; // Specify how many Fibonacci numbers to print
        System.out.println("Fibonacci sequence up to " + count + " terms:");
        printFibonacciSequence(count); // Call the method to print Fibonacci sequence
    }

}

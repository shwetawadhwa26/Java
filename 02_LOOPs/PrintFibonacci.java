public class PrintFibonacci {
    public static void printFibonacciSequence(int count) {
        int a = 0; 
        int b = 1; 
        int c;     

        // Loop to print Fibonacci sequence
        for (int i = 1; i <= count; i++) {
            System.out.print(a); 
            if (i < count) {
                System.out.print(", ");
            }
            c = a + b; 
            a = b;     
            b = c;     
        }
    }

    public static void main(String[] args) {
        int count = 10; 
        System.out.println("Fibonacci sequence up to " + count + " terms:");
        printFibonacciSequence(count);
    }

}

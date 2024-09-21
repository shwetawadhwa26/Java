public class MainThread {
    public static void main(String[] args) {
        int n = 2;  // Take this as input
        ReverseGreet thread = new ReverseGreet(n);
        thread.start();
    }
}

class ReverseGreet extends Thread {
    int num;

    ReverseGreet(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        // Print the current thread's greeting first
        System.out.println("CodeQuotient Thread" + num);

        // If there is a next thread, create it
        if (num > 1) {
            ReverseGreet nextThread = new ReverseGreet(num - 1);
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
    }
}
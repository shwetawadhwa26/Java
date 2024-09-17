class MultithreadingDemo extends Thread {
    public void run() {
        try {
            
            System.out.println("Thread " + Thread.currentThread().getName() + " is running with ID: " + Thread.currentThread().getId());
        } catch (Exception e) {
       
            System.out.println("Exception is caught");
        }
    }


// Main Class
public class Multithread {
    public static void main(String[] args) {
        int n = 8; 
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            object.setName("Thread-" + i); 
            object.start();
        }
    }

}

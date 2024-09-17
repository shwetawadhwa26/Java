//Multithreading - process os executing multiple threads simultaneously
//it helps in maximum utilisation of Cpu
//Threads are independent, they dont affect execution of other threads
//An exeception in one thread will not interrupt other threads
//it is useful for swrving multiple clients, multiplayer games or other mutually independent taks

public class Main{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();


    }
}
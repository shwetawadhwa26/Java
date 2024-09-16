
class MyThread extends Thread{
    @Override
    public void run(){
        while (true) { 
            System.out.println("My thread is running");
        System.out.println("I am Happy");
        }
        
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true) { 
            System.out.println("My thread is running");
        System.out.println("I am Sad");
        }
        
    }
}
public class createthread {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();


    }
    
}

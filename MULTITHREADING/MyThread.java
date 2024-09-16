


//Process of executing multiple threads simultaneously 
//It helps maximum utilization of CPU
//Threads are independent they dont affect the execution of other threads
//An exception in one thread will not interrupt other threads
//Useful for serving multiple clients, multiplayer games or other mutual independent tasks


public class MyThread extends Thread {
    @Override
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Thread 1 "+i);
            try{
            Thread.sleep(1000);}
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}

public class basics{
    public static void main(String[] args) {
        
    }
}



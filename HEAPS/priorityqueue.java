import java.util.PriorityQueue;
public class priorityqueue {
    public static void main(String[] args) {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Top element " + pq.peek());
        System.out.println("Removed top element: " + pq.poll());
        System.out.println("PriorityQueue after removal: " + pq);
        System.out.println("size: " + pq.size());

        if(pq.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
        
    }
    
    
}

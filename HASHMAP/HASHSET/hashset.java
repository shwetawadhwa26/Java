import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        //Creation of HashSet
        HashSet<Integer> set = new HashSet<>();

        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); //list.add(el)
        //Print all elements 
        System.out.println(set);

        //Search - contains
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set doesnt contains");
        }


        //Delete 

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set doesnt contains 1");
        }
        //Size of set
        
        System.out.println("size = " + set.size());

        //Iterator
        Iterator it = set.iterator();

        //hasNext; next 
        while(it.hasNext()){
            System.out.println(it.next());
        }

        }
    
}

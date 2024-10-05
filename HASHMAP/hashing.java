//Hashmaps are unordered maps  

import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {
        //country,population
        HashMap<String,Integer> map = new HashMap<>();


        //Insertion operation - put()

        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China", 440);
        System.out.println(map);
    }
    
}

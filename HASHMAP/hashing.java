//Hashmaps are unordered maps  

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


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


        //Search function - containsKey() , get()
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        if(map.containsKey("Dubai")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));//key exists
        System.out.println(map.get("Mexico"));//key doesnt exist

        //Iteration

        int arr[] ={12,15,18};
        for(int i =0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();


        //Iteration in HashMap - Entry Set
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Iteration in HashMap - Key Set
        Set<String> keys=map.keySet();
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("China");
        System.out.println(map);

        map.remove("Canada");
        System.out.println(map);

        System.out.println(map.size());

    }
    
}

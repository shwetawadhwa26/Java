import java.util.HashSet;
import java.util.Set;


public class UnionOfTwoArrays {
    public static Set<Integer> union(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
                set.add(arr1[i]);
        }
        for(int j =0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set;
        
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]={2,9,4,4,10,12,8};
        Set<Integer> unionSet = union(arr1, arr2);
        System.out.println(unionSet);
         System.out.println("size of the union set = " + unionSet.size()); 
    }
    
}

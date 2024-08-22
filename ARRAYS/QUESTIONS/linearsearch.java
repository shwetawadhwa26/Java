
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= new int[5];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("ENTER THE DIGIT YOU WANT TO FIND");
        int find = scanner.nextInt();
        
        int i;
        for( i =0;i<arr.length;i++){
            if(arr[i]==find){
                System.out.println(find);
                break;
            }
            
        }
        if(i==arr.length){
            System.out.println("pls enter a valid digit");
        }
        
    }
    
}

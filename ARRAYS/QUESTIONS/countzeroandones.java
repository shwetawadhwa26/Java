
import java.util.Scanner;

public class countzeroandones {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[10];
    int sumzero =0;
    int sumone =0;
    for(int i=0;i<arr.length;i++){
        arr[i] = scanner.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i] == 0){
            sumzero=sumzero+1;
        }
        else if(arr[i]==1){
            sumone=sumone+1;
        }
    }

    for(int i =0;i<sumzero;i++){
        System.out.println("0");
    }

    for(int i =0;i<sumone;i++){
        System.out.println("1");
    }

    
}
}
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
    
}
